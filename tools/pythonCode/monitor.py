import socket, multiprocessing
import numpy as np
import synchronizer as sync
from EEG import EEG
from ECG import ECG
from SynchronizedECG_Holder import SynchronizedECG
from SynchronizedEEG_Holder import SynchronizedEEG

"""
TODO : currently not working,
class monitor : allows to associate the interfacers and the dataflows by redirecting the incoming and outgoing flows

should allow to launch a server on which each dataflow sends data, once received these data are redirected to the interfacer,
the interfacers process this data and send it back to the monitor which sends it back to the specified dataflow
"""
class Monitor:
    def __init__(self) -> None:
        self.server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        self.host = socket.gethostname()
        self.port = 5000 
        self.server.bind((self.host, self.port))
        self.nb_workers = 10
        self.interfacers = {}
        self.dataflows = {}
        self.outputs = []
        pass

    def allocDataflow(self,dataflow):
        self.dataflows[dataflow.name] = dataflow
    
    def start(self):
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
            s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
            s.bind((self.host, self.port))
            s.listen(100)

            with multiprocessing.Pool(multiprocessing.cpu_count() - 1) as pool:
                while True:
                    client, address = s.accept()
                    pool.apply(self.handle, (client, address))
                    #self.handle(client,address)

    def startDataflow(self,name):
        self.dataflows[name].start(self.host)

    def close(self):
        for server in self.servers:
            server["server"].close()

    def out(self,from_interfacer,to_address):
        pass

    def connect(self,interfacer):
        self.interfacers[interfacer.name] = interfacer
        interfacer.connectToMonitor(self)

    def connectInput(self,interfacer,*dataflow):
        interfacer.input(*dataflow)
    def connectOutput(self,interfacer,*dataflow):
        interfacer.output(*dataflow)    

    def handle(self,client,address):
        #for interfacer in subscribed_interfacers:
        #    interfacer.connect(name)
        with client:

            buff =  client.recv(1024)
            name = buff.decode('utf-8')
            print(f"{name} is connected")
            subscribed_interfacers = [interfacer for interfacer in self.interfacers.values() \
                   if name in interfacer.getInputNames()]
            while True:
                buff = client.recv(1024)
                if not buff : break
                data = np.frombuffer(buff)
                data.shape = (1,100)
                for interfacer in subscribed_interfacers:
                    interfacer.buffer(self.dataflows[name],data)

    def listen(self,from_interfacer,*dataflows_chunks):
        print(from_interfacer + " : " + str(len(dataflows_chunks)))
"""
initialization and connection of all graph nodes
"""
def main():
    monitor = Monitor()

    dataflows = {}

    dataflows["eeg"] = EEG("eeg",5000,5010)
    dataflows["ecg"] = ECG("ecg",5000,5011)
    dataflows["synchroEeg"] = SynchronizedEEG("synchroEeg",5000,5012)
    dataflows["synchroEcg"] = SynchronizedECG("synchroEcg",5000,5013)

    synchronizer = sync.Synchronizer("Sync")
    monitor.connect(synchronizer)
    monitor.connectInput(synchronizer,dataflows["eeg"],dataflows["ecg"])
    monitor.connectOutput(synchronizer,dataflows["synchroEeg"],dataflows["synchroEcg"])


    monitor.allocDataflow(dataflows["eeg"])
    monitor.allocDataflow(dataflows["ecg"])
    monitor.allocDataflow(dataflows["synchroEeg"])
    monitor.allocDataflow(dataflows["synchroEcg"])

    import threading 

    def dataflowStart(name):
        def start():
            monitor.startDataflow(name)
        return start
    def monitorStart():
        monitor.start()

    t1 = threading.Thread(target=monitorStart)
    #t2 = threading.Thread(target=dataflowStart("eeg"))
    #t3 = threading.Thread(target=dataflowStart("ecg"))
    #t4 = threading.Thread(target=dataflowStart("synchroEeg"))
    #t5 = threading.Thread(target=dataflowStart("synchroEcg"))

    t1.start()

    #import time
    #time.sleep(1)
    #t2.start()
    #t3.start()

if __name__ == '__main__':
    main()