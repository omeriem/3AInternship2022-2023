import numpy as np
BUFFER_SIZE = 4


class StreamBuffer:
    def __init__(self, BUFFERSIZE, send):
        self.BUFFERSIZE = BUFFERSIZE
        self.send = send
        self.chunk = np.array([])

    def push(self, data):
        remaining = self.BUFFERSIZE - len(self.chunk)
        if len(data) > remaining:
            self.chunk = np.concatenate((self.chunk, data[0: remaining]))
            self.commit()
            self.push(data[remaining: len(data)])
        else:
            self.chunk = np.concatenate((self.chunk, data))
            self.commit()
    
    def commit(self):
        if len(self.chunk) == self.BUFFERSIZE:
                self.send(self.chunk)
                self.chunk = np.array([])

class Buffer :
    def __init__(self, BUFFERSIZE, streams, send):
        self.BUFFERSIZE = BUFFERSIZE
        self.send = send
        self.buffers = {}
        self.outputStorage = {}
        def build(stream):
            def commitChunk(data):
                self.commit(stream, data)
            return commitChunk
        self.ref = []
        for stream in streams:
            self.buffers[stream.name] =StreamBuffer(BUFFERSIZE, build(stream.name) )
            self.outputStorage[stream.name] = None
            self.ref.append(stream.name)

    def push(self, streamName, data):
        self.buffers[streamName].push(data)

    def push(self, data):
        for i, d in enumerate(data):
            self.buffers[self.ref[i]].push(d)

    def commit(self, stream, data):
        self.outputStorage[stream] = data
        if len([s for s in list(self.outputStorage.values()) if s is None]) == 0:
            self.send(self.outputStorage)
            self.outputStorage = {key : None for key, _ in self.outputStorage.items()}

def fSend(data):
    if(len(data)!=1000):
        print("error")

def main():
    buffer = Buffer(100, fSend)
    buffer.push(np.array(list(range(1000))))
 


if __name__ == '__main__':
    main()