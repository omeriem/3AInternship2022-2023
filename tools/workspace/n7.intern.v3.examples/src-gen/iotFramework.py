import socket, multiprocessing
import numpy as np
import synchronizer as sync


class Monitor:
    def __init__(self) -> None:
        self.servers = []    
        self.host = socket.gethostname()
        self.port = 5000 
        self.nb_workers = 10
        self.interfacers = [] 
        self.outputs = [] 
        pass

    def allocDataflow(self,dataflow):
        server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        server.bind((self.host, self.port+1))
        self.servers.append({"dataflow":dataflow,"server":server})
    
    def start(self):
        def accept(server):
            with multiprocessing.Pool(self.nb_workers) as pool:
                while True:
                    client,address = server[ "server"].accept()
                    pool.apply(self.handle, (client, server["thing"]))

        with multiprocessing.Pool(self.nb_workers) as pool:
            for server in self.servers:
                server["server"].listen(10)    
                pool.apply(accept,(server))

    def close(self):
        for server in self.servers:
            server["server"].close()

    def out(self,from_interfacer,to_address):
        pass

    def connect(self,interfacer,*dataflow_descriptors):
        interfacer.connectToMonitor(self)
        interfacer.input(*dataflow_descriptors)
        

    def handle(self,client,dataflow):
        subscribed_interfacers = [interfacer for interfacer in self.interfacers \
                if dataflow.name in interfacer.getInputNames()]
        for interfacer in subscribed_interfacers:
            interfacer.connect(dataflow)

        with client:
            while True:
                buff = client.recv(1024)
                if not buff : break
                data = np.frombuffer(buff)
                for interfacer in subscribed_interfacers:
                    interfacer.buffer(dataflow,data)

    def listen(self,from_interfacer,*dataflows_chunks):
        print(from_interfacer + " : " + str(len(dataflows_chunks)))

def main():
    monitor = Monitor()
	dataflows = {}
	dataflows["eeg"] = EEG("eeg")
	dataflows["ecg"] = ECG("ecg")
	
	dataflows["classifiedECG"] = Holder("classifiedECG")
	dataflows["cleanEEG"] = Holder("cleanEEG")
	dataflows["synchronizedSignals"] = Holder("synchronizedSignals")
	
	_Synchro = Synchro.Synchro("Synchro")
	
	_Classifier = Classifier.Classifier("Classifier")
	
	_MlModel = MlModel.MlModel("MlModel")
	
	monitor.connect(_MlModel,datflows["ecg"] )
	monitor.connect(_Classifier,datflows["eeg"] )
	monitor.connect(_Synchro,datflows["classifiedECG"] ,datflows["cleanEEG"] )
	
	
	monitor.allocDataflow(dataflow["eeg"])
	monitor.allocDataflow(dataflow["ecg"])
	monitor.allocDataflow(dataflow["console"])
	monitor.allocDataflow(dataflow["database"])
	monitor.allocDataflow(dataflow["classifiedECG"])
	monitor.allocDataflow(dataflow["cleanEEG"])
	monitor.allocDataflow(dataflow["synchronizedSignals"])
	

    monitor.start()



if __name__ == '__main__':
    main()
