from Stream import Stream
import time
import numpy as np
import socket, multiprocessing


def sin(sample_rate,start,end):
    dt = 1/sample_rate
    f = 1
    w = 2*np.pi*f
    t = np.arange(start, end, dt)
    signal = np.sin(w*t)
    return signal,t


def dataflow(start,sample_rate,function, send):
    dt = 1/sample_rate
    T = dt*100
    t = time.time()
    signal,_ = function(sample_rate,start,start+T)
    start += T
    remaining = T - (time.time() - t)
    if remaining > 0:
        time.sleep(remaining)
    result = np.zeros((1,len(signal)))
    result[0] = signal
    send(result)

def client(port,sample_rate,function):
    host = socket.gethostname()  # as both code is running on same pc
    x = np.linspace(0,10,100)

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.connect((host, port))
        def send(data):
            print(f"send {data.shape}")
            s.send(data.tobytes())
        start = 0
        while True:
            dataflow(start,sample_rate,function,send)
            start += 1/sample_rate*100

class ECG :
    def __init__(self, name,monitor_port,input_port):
        self.name = name
        self.monitor_port = monitor_port
        self.input_port = input_port

        self.host = socket.gethostname()
        self.monitor_server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


    def start(self,monitor_host):
        print(f"{self.name} starts")
        self.monitor_host = monitor_host
        self.monitor_server.connect((self.monitor_host, self.monitor_port))

        self.monitor_server.send(self.name.encode())
        print(f"send name : {self.name}")
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
            s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
            s.bind((self.host, self.input_port))
            s.listen(10)    
            with multiprocessing.Pool(multiprocessing.cpu_count() - 1) as pool:
                while True:
                    client,address = s.accept()
                    pool.apply(self.handle, (client,address))
        
    def handle(self,client,address):
         with client:
            while True:
                buff = client.recv(1024)
                if not buff : break
                data = np.frombuffer(buff)
                data.shape = (1,100)
                print(f"{self.name} as received {data.shape}")
                
                self.monitor_server.send(data.tobytes())
                print(f"sent to monitor at port {self.monitor_port}")
    @staticmethod
    def getStreams():
        return [Stream("ecg",float, 186)]

def main():
    ecg = ECG("ecg",5000,5011)
    ecg.start(socket.gethostname())

if __name__ == '__main__':
    main()