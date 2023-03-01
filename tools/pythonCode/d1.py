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

def main():
    client(5010,100,sin)

if __name__ == '__main__':
    main()