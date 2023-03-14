"""
class SynchronizingQueue : used by the Synchronizer.
"""
from queue import Queue

"""
dict of queues. Each queue is associated with a name. 
The class contains FIFO functions
"""
class SynchronizingQueue:

    def __init__(self,dataflows):
        self.queues = { d.name : Queue() for d in dataflows }

    """
    new data are added at the end of a queue
    """
    def put(self,dataflow,chunk):
        #print(self.queues)
        #print(f"put in {dataflow.name} :: size of queue : {self.queues[dataflow.name].qsize()}")
        self.queues[dataflow.name].put(chunk)

    """
    returns the first elements of the queues that are connected.
    each first element is deleted from the queue with the function get().
    """
    def pop(self,connected_status):
        storage = {}
        for name in [name for name in self.queues.keys() if connected_status[name]]:
            storage[name] = self.queues[name].get()
        return storage

    """
    returns none for each queue that is empty, as get() will wait for data if it is called on an empty queue.
    """
    def tryPop(self,connected_status):
        if 0 in [self.queues[name].qsize() for name in self.queues.keys() if connected_status[name]]:
            return None
        return self.pop(connected_status)
        
    """
    returns the first element of a specific queue
    """
    def popFromName(self,name):
        storage = {}
        storage[name] = self.queues[name].get()
        return storage

    """
    returns the size of each queue
    """
    def snap(self):
        return {name:q.qsize() for name,q in self.queues.items()}
