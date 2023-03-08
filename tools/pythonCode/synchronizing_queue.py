
from queue import Queue


class SynchronizingQueue:

    def __init__(self,dataflows):
        self.queues = { d.name : Queue() for d in dataflows }

    def put(self,dataflow,chunk):
        #print(self.queues)
        #print(f"put in {dataflow.name} :: size of queue : {self.queues[dataflow.name].qsize()}")
        self.queues[dataflow.name].put(chunk)

    def pop(self,connected_status):
        storage = {}
        for name in [name for name in self.queues.keys() if connected_status[name]]:
            storage[name] = self.queues[name].get()
        return storage

    def tryPop(self,connected_status):
        if 0 in [self.queues[name].qsize() for name in self.queues.keys() if connected_status[name]]:
            return None
        return self.pop(connected_status)
        
    def popFromName(self,name):
        storage = {}
        storage[name] = self.queues[name].get()
        return storage


    def snap(self):
        return {name:q.qsize() for name,q in self.queues.items()}