
import numpy as np
import math
import buffer
import SynchronizedEEG_Holder


def ID(data):
    return data



class Preprocessor : 
    def __init__(self,name) -> None:
        self.name = name
        self.inputBuffers = {}
        self.outputBuffers = {}

        self.inputDescriptors = [SynchronizedEEG_Holder.Holder.getStreams(), SynchronizedEEG_Holder.Holder.getStreams()]
        self.outputDescriptors = [SynchronizedEEG_Holder.Holder.getStreams(), SynchronizedEEG_Holder.Holder.getStreams()]
        
        self.connected_dataflows = {}

        self.inputDataflows = {}
        self.outputDataflows = {}

    def buffer(self, dataflow, data):
        self.inputBuffers[dataflow.name].push(data)

    def connectToMonitor(self, monitor):
        self.monitor = monitor

    def connect(self,dataflow):
        self.connected_dataflows[dataflow.name] = True 

    def input(self, *dataflows):
        def build(dataflow):
            def receiveChunk(data):
                self.receive(dataflow, data)
            return receiveChunk
        self.storage = {}
        for dataflow in dataflows :
            self.inputBuffers[dataflow.name] = buffer.Buffer(buffer.BUFFER_SIZE, dataflow.getStreams(), build(dataflow))
            self.inputDataflows[dataflow.name] = dataflow
            self.storage[dataflow.name] = None            
 
    def getInputNames(self):
        return list(self.inputDataflows.keys())
        
    def output(self, *dataflows):
        def build(dataflow):
            def commitChunk(data):
                self.commit(dataflow, data)
            return commitChunk
        self.ref = []
        self.outputStorage = {}
        for dataflow in dataflows :
            self.ref.append(dataflow.name)
            self.outputBuffers[dataflow.name] = buffer.Buffer(buffer.BUFFER_SIZE, dataflow.getStreams(), build(dataflow))
            self.outputDataflows[dataflow.name] = dataflow
            self.outputStorage[dataflow.name] = None

    def receive(self,dataflow, chunk):
        self.storage[dataflow.name] = chunk
        if len([s for s in list(self.storage.values()) if s is None]) == 0:
            self.preprocess(self.storage)
            self.storage = {key : None for key, _ in self.storage.items()}

    def commit(self,dataflow, chunk):
        self.outputStorage[dataflow.name] = chunk
        if len([s for s in list(self.outputStorage.values()) if s is None]) == 0:
            self.push()
            self.outputStorage = {key : None for key, _ in self.outputStorage.items()}
        

    def push(self):
        if self.monitor != None :
            self.monitor.listen(self.name, self.outputStorage)

    def preprocess(self, storage):
        result = ID(storage.values())
        for i, r in enumerate(result):
            self.outputBuffers[self.ref[i]].push(list(r.values()))    


class MonitorProxy:
    def __init__(self) -> None:
        pass

    def listen(self, name, storage):
        print(f"{name} : {storage}")

def main():
    prep = Preprocessor("prep")
    monitor = MonitorProxy()
    prep.connectToMonitor(monitor)
    h1 = SynchronizedEEG_Holder.Holder("h1")
    h2 = SynchronizedEEG_Holder.Holder("h2")
    prep.input(h1, h2)
    h3 = SynchronizedEEG_Holder.Holder("h3")
    h4 = SynchronizedEEG_Holder.Holder("h4")
    prep.output(h3, h4)

    prep.buffer(h1, [list(range(2))])
    prep.buffer(h2, [list(range(2,4))])
    prep.buffer(h1, [list(range(4,6))])
    prep.buffer(h2, [list(range(6,8))])


if __name__ == '__main__':
    main()