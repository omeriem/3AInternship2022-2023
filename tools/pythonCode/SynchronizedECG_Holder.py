from Stream import Stream
import time
import numpy as np
import socket, multiprocessing

class SynchronizedECG :
    def __init__(self, name,monitor_port,input_port):
        self.name = name
        self.monitor_port = monitor_port
        self.input_port = input_port

        self.host = socket.gethostname()
        self.monitor_server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


    def start(self,monitor_host):
        self.monitor_host = monitor_host
        self.monitor_server.connect((self.monitor_host, self.monitor_port))

        self.monitor_server.send(self.name.encode())

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
        return [Stream("ecg",float, None)]