"""
Classes StreamBuffer and Buffer
Class Buffer : used by the preprocessor, synchronizer and processor to store data.
"""
import numpy as np
BUFFER_SIZE = 4

"""
class StreamBuffer : A chunk associated with a "send" function.
"""
class StreamBuffer:
    def __init__(self, BUFFERSIZE, send):
        self.BUFFERSIZE = BUFFERSIZE
        self.send = send
        self.chunk = np.array([])

    """
    data are added until the buffersize is reached, then the commit function is called
    """
    def push(self, data):
        remaining = self.BUFFERSIZE - len(self.chunk)
        #print(f"BUFFER : remaining {remaining} and data {len(data)} ")
        if len(data) > remaining:
            self.chunk = np.concatenate((self.chunk, data[0: remaining]))
            self.commit()
            self.push(data[remaining: len(data)])
        else:
            self.chunk = np.concatenate((self.chunk, data))
            self.commit()
    
    """
    sends the data when a chunk is full, using the "send" function. It re initializes the chunk
    """
    def commit(self):
        if len(self.chunk) == self.BUFFERSIZE:
                self.send(self.chunk)
                self.chunk = np.array([])

"""
class Buffer: dict with each BufferStream associated with a name. 
"""
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

    """
    calls the push function from StreamBuffer 
    """
    def push(self, streamName, data):
        self.buffers[streamName].push(data)

    def push(self, data):
        for i, d in enumerate(data):
            self.buffers[self.ref[i]].push(d)

    """
    every buffer in outputStorage are sent if outputStorage is full
    """
    def commit(self, stream, data):
        self.outputStorage[stream] = data
        if len([s for s in list(self.outputStorage.values()) if s is None]) == 0:
            self.send(self.outputStorage)
            self.outputStorage = {key : None for key, _ in self.outputStorage.items()}

"""
test function
"""
def fSend(data):
    if(len(data)!=1000):
        print("error")

"""
test of the Buffer with the fSend function and a size 100 as buffersize
"""
def main():
    buffer = Buffer(100, fSend)
    buffer.push(np.array(list(range(1000))))
 


if __name__ == '__main__':
    main()
