import numpy as np
import math
import matplotlib.pyplot as plt
import SynchronizedEEG_Holder
import SynchronizedECG_Holder
import ECG
import EEG
import buffer
import synchronizing_queue
from Stream import Stream

"""
Class Snapshot : allows to "save" the state of the stack at the time of the rendezvous,
starting at : represents the index of the last element of the dataflow stack at the time of the rendezvous, starting at allows to know where the stack was at the rendezvous,
size : a dict representing the number of elements to wait for to complete the rendezvous delay according to the
    sample rates of each stream, e.g. if we give a rendezvous in 1sec a stream of sample rate 1000Hz will have to wait for 1000 elements while a stream of 1200Hz will have to wait for 1200,
index_chunk and index_in : are respectively the index of the chunk in the stack and the index of the element in the chunk ending the wait for the appointment,
    
example : we give a rendezvous in 1sec for a 1200Hz sample stream, we suppose that there are
    already n chunk in the grid (with 1000 element per chunk),
    then the index of the last element in the stack at the time of the appointment (starting_at) is n*1000,
    the number of element to wait (size) is 1200,
    and the index of the element marking the end of the wait is n*1000 + 1200 => index_chunk = n+1 and index_in = 200

"""
class Snapshot:
    def __init__(self,starting_at,size,index_chunk,index_in):
        self.starting_at = starting_at
        self.size = size
        
        self.index = {}
        for name in index_chunk.keys():
            self.index[name] = [index_chunk[name],index_in[name]] 
    def __repr__(self) -> str:
        return f"Starting at : {self.starting_at}, Size : {self.size}, Index : {self.index}"

"""
class Indexer : allows to save the current snapshots 
and convert the real index of a chunk into an index relative to the rendezvous with respect to the sample rate of the streams and the minimal sample rate
"""
class Indexer:
    def __init__(self,dataflows):
        self.indexes = {d.name:None for d in dataflows}

    def snap(self,name,starting_at,sizes,buffer_size):
        self.indexes[name] = Snapshot(starting_at,\
            sizes,\
            {name: int((starting_at + size - 1)/buffer_size) for name,size in sizes.items()},\
            {name: (starting_at + size - 1)%buffer_size for name,size in sizes.items()})

    def print(self):
        print(self.indexes)
    def startingAt(self,name):
        return self.indexes[name].starting_at
    def size(self,name):
        return self.indexes[name].size 
    def index(self,name):
        return self.indexes[name].index
    """
    pop : allows to get the relative indexes of the streams of the dataflows connecting and updating the snapshots
    a relative index is a dict composed of real index (i) (index of a chunk [0,1,..,n]),
    the delta (h) representing the time difference between two measurements of 
    sample rate S => h=1/S allowing the calculation of the discrete derivative of the signal 
    dS/dt = (s(t+h)-s(t))/h,
    lower_bound representing s(t),
    upper_bound representing s(t+h)
    and t being the time of the measurement taken with the minimal sample rate
    """
    def pop(self,connected_name,buffer_size,min_sample_rate,getStreams):
        result = {}
        for name in connected_name:
            result[name] = {}
            for stream in getStreams(name):

                sample_rate = stream.sample_rate

                zero = (self.indexes[name].index[stream.name][0])*buffer_size + self.indexes[name].index[stream.name][1] + 1

                zero_C = - zero
                zero_C_T = zero_C*(1/sample_rate)
                zero_S = np.floor(zero_C_T*min_sample_rate)
                size_S = int(buffer_size*min_sample_rate/sample_rate)

                h = 1/sample_rate

                def Delta(i):
                    synchronized_index = zero_S + i
                    synchronized_time = synchronized_index*(1/min_sample_rate)
                    return abs(zero_C_T - synchronized_time)

                def lowerBound(delta):
                    return math.floor(delta*sample_rate)
                
                def T(delta,lower_bound):
                    return delta - lower_bound*h
                I = [ {"i":i,"t":T(Delta(i),lowerBound(Delta(i))) , "h":h , "lower_bound":lowerBound(Delta(i)), "upper_bound":lowerBound(Delta(i))+1 } for i in range(int(size_S)) ]



                result[name][stream.name] = {"index" :I,"starting_time":zero_C_T}
            
                self.indexes[name].index[stream.name][0] -= 1
        return result
        
    

"""
class Synchronizer : allowing to synchronize several dataflow 
including several datastreams with different sample rates according to the smallest sample rate

"""
class Synchronizer : 
    def __init__(self,name) -> None:
        self.name = name
        self.inputBuffers = {}
        self.outputBuffers = {}
        self.BUFFER_SIZE = 1000


        self.inputDescriptors = [EEG.EEG.getStreams(), ECG.ECG.getStreams()]
        self.outputDescriptors = [SynchronizedEEG_Holder.SynchronizedEEG.getStreams(), SynchronizedECG_Holder.SynchronizedECG.getStreams()]    
        
        self.inputDataflows = {}
        self.outputDataflows = {}

        self.rendez_vous_delay = 1
        self.rendez_vous_period = 10
        self.rendez_vous_counter = 0
        self.dataflow_isWaiting = {}
        self.rendez_vous_up_to_date = {}

        self.dataflow_connected_status = {}

    """
        PUBLIC:
        allows to add data to the buffer corresponding to the sending dataflow,
        once the buffer has received enough data 
        to make a chunk of known size, this chunk will be sent back to the synchronizer 
    """
    def buffer(self, dataflow, data):
        self.inputBuffers[dataflow.name].push(data)

    def connectToMonitor(self, monitor):
        self.monitor = monitor
    """
        PUBLIC:
        is used to initialize the synchronizer inputs
    """
    def input(self, *dataflows):
        self.queue = synchronizing_queue.SynchronizingQueue(dataflows)
        self.indexer = Indexer(dataflows)
        def build(dataflow):
            def receiveChunk(data):
                self.receive(dataflow, data)
            return receiveChunk
        self.ref = []
        for dataflow in dataflows :
            self.inputBuffers[dataflow.name] = buffer.Buffer(self.BUFFER_SIZE, dataflow.getStreams(), build(dataflow))
            self.inputDataflows[dataflow.name] = dataflow
            self.dataflow_isWaiting[dataflow.name] = False
            self.rendez_vous_up_to_date[dataflow.name] = False
            self.dataflow_connected_status[dataflow.name] = False
            self.ref.append(dataflow.name)
    """
        PUBLIC : 
        allows you to connect a dataflow and thus signify its presence, launch an appointment
    """
    def connect(self,dataflow):
        print(f"CONNECTION {dataflow.name}")
        self.dataflow_connected_status[dataflow.name] = True
        self.outdateRendezVous()
        self.launchRendezVous()

    def disconnect(self,dataflow):
        self.dataflow_connected_status[dataflow.name] = False
    
    def getInputNames(self):
        return list(self.inputDataflows.keys())


    """
        PUBLIC : 
        allows to initialize the synchronizer outputs
    """
    def output(self, *dataflows):
        def build(dataflow):
            def commitChunk(data):
                self.commit(dataflow, data)
            return commitChunk
        self.output_queue = synchronizing_queue.SynchronizingQueue(dataflows)
        i = 0
        self.outputName = {}
        for dataflow in dataflows :
            self.ref.append(dataflow.name)
            self.outputBuffers[dataflow.name] = buffer.Buffer(self.BUFFER_SIZE, dataflow.getStreams(), build(dataflow))
            self.outputDataflows[dataflow.name] = dataflow
            self.outputName[self.ref[i]] = dataflow.name
            i += 1

    """
         once a chunk is received from the buffer it is stored in the queue to be synchronized
    """
    def receive(self,dataflow, chunk):
        print(f"receive from buffer : {dataflow.name}")
        self.queue.put(dataflow,chunk)
        self.rendezVous(dataflow)
        print(self.queue.snap())
        if self.isRendezVousUpToDate():
            self.synchronize()


    def commit(self,dataflow, chunk):
        print(f"COMMIT {dataflow.name}")
        self.output_queue.put(dataflow,chunk)
        self.push()
        
    """
        allows to send synchonized data to monitor
    """
    def push(self):
        print(f"PUSH QUEUE {self.queue.snap()}")
        connected_status = {self.outputName[name]: self.dataflow_connected_status[name] for name in self.inputDataflows.keys() }
        result = self.output_queue.tryPop(connected_status)

        print(f"PUSH OUTPUT QUEUE  {self.output_queue.snap()}")
        if result == None: return
        if self.monitor != None :
            self.monitor.listen(self.name, result)

    def incrementRendezVousCycle(self):
        self.rendez_vous_counter = (self.rendez_vous_counter + 1) % self.rendez_vous_period
        if self.rendez_vous_counter == 0:
            self.outdateRendezVous()

    def outdateRendezVous(self):
        self.rendez_vous_counter = 0
        for name in self.rendez_vous_up_to_date.keys():
            self.rendez_vous_up_to_date[name] = False


    def isRendezVousUpToDate(self):
        dataflows = [name for name in self.inputDataflows.keys() if self.dataflow_connected_status[name]] 

        return False not in [self.rendez_vous_up_to_date[name] for name in dataflows]
    def isWaiting(self):
        dataflows = [name for name in self.inputDataflows.keys() if self.dataflow_connected_status[name]] 
        return True in [self.dataflow_isWaiting[name] for name in dataflows]

    def launchRendezVous(self):
        self.snap()
        dataflows = [name for name in self.inputDataflows.keys() if self.dataflow_connected_status[name]] 
        for name in dataflows:
            self.dataflow_isWaiting[name] = True

    """
        allows you to make an appointment and update the indexes 
    """
    def rendezVous(self,dataflow):
        name = dataflow.name
        snap = self.queue.snap()
        if self.isRendezVousUpToDate():
            return
        if not self.isRendezVousUpToDate() and not self.isWaiting():
            self.launchRendezVous()
    
        sizes =self.indexer.size(name)

        tmp = np.array([size + self.indexer.startingAt(name) for _,size in sizes.items()])

        all_over_waiting = False not in (tmp <= snap[name]*self.BUFFER_SIZE)
        if self.dataflow_isWaiting[name] and all_over_waiting:
            self.rendez_vous_up_to_date[name] = True
            self.dataflow_isWaiting[name] = False
        #print(f"is waiting : {self.isWaiting()} with {self.dataflow_isWaiting}")
        #self.indexer.print()


    """
        retrieves chunks from the stack and synchronizes them
    """
    def synchronize(self):
        chunks = self.queue.tryPop(self.dataflow_connected_status)
        if chunks == None:
            return 
        min_sample_rate = self.getMinSampleRate()
        dataflows = [name for name in self.inputDataflows.keys() if self.dataflow_connected_status[name]] 
        #self.indexer.print()
        indexes = self.indexer.pop(dataflows,self.BUFFER_SIZE,min_sample_rate,self.getStreamsOf)
        #print({key:{ stream:i["starting_time"] for stream,i in item.items()} for key,item in indexes.items()})
        for name,chunk in chunks.items():
            result = self.chunkSynchronization(chunk,indexes[name])
            self.outputBuffers[self.outputName[name]].push(list(result.values()))
        self.incrementRendezVousCycle()
        
    """ 
    synchronize a chunk
    """
    def chunkSynchronization(self,chunk,indexes):
        result = {}
        for name,data in chunk.items():
            index = indexes[name]
            result[name] = np.zeros((len(index["index"])))
            for I in index["index"]:
                t = I["t"]
                h = I["h"]
                l = I["lower_bound"]
                l = l if l>=0 else 0
                u = I["upper_bound"]
                u = u if u < len(data) else len(data) - 1
                result[name][I["i"]] = self.interpolationFunction(t,h,data[l],data[u])
        return result
    def interpolationFunction(self,t,h,fl,fu):
        return ((fu-fl)/(h))*t + fl


    def getMinSampleRate(self):
        dataflows = [self.inputDataflows[name] for name in self.inputDataflows.keys() if self.dataflow_connected_status[name]] 
        return np.min([ np.min([stream.sample_rate for stream in dataflow.getStreams()]) for dataflow in dataflows])

    def getStreamsOf(self,name):
        return self.inputDataflows[name].getStreams()

    def getSampleRateOf(self,name):
        return np.array([stream.sample_rate for stream in self.inputDataflows[name].getStreams()])

    def snap(self):
        for name,size  in self.queue.snap().items():
            self.indexer.snap(name,\
                size*self.BUFFER_SIZE,\
                {s.name: s.sample_rate*self.rendez_vous_delay for s in self.getStreamsOf(name)},\
                self.BUFFER_SIZE)
                
        


"""
TEST -----------------------------

"""

def sin(sample_rate,start,end):
    dt = 1/sample_rate
    f = 2
    w = 2*np.pi*f
    t = np.arange(start, end, dt)
    signal = np.sin(w*t) #+ 0.5* np.random.randn(len(t))

    return signal

def cos(sample_rate,start,end):
    dt = 1/sample_rate
    f = 2
    w = 2*np.pi*f
    t = np.arange(start, end, dt)
    signal = np.cos(w*t) #+ 0.5* np.random.randn(len(t))

    return signal

def plotSignals(signal1,signal2):
    fig, ax = plt.subplots(3,1)
    ax[0].plot(signal1, color='b', label='S1')
    ax[0].set_xlabel('t axis')
    ax[0].set_ylabel('Vals')
    ax[0].legend()
    ax[1].plot(signal2, color='r', label='S2')
    ax[1].set_xlabel('t axis')
    ax[1].set_ylabel('Vals')
    ax[1].legend()
    ax[2].plot(signal1, color='r', label='S1')
    ax[2].plot(signal2, color='b', label='S2')

def plotRealSignals(signal1,sr1,signal2,sr2):
    t1 = np.arange(0, len(signal1)*(1/sr1), 1/sr1)
    t2 = np.arange(0, len(signal2)*(1/sr2), 1/sr2)
    fig, ax = plt.subplots(2,1)
    ax[0].plot(t1,signal1, color='b', label='Real S1')
    ax[0].set_xlabel('t axis')
    ax[0].set_ylabel('Vals')
    ax[0].legend()
    ax[1].plot(t2,signal2, color='r', label='Real S2')
    ax[1].set_xlabel('t axis')
    ax[1].set_ylabel('Vals')
    ax[1].legend()

def compare(s1,s2,s3,s4):
    fig, ax = plt.subplots(2,1)
    ax[0].plot(s1, color='r', label='S1')
    ax[0].plot(s2, color='b', label='S2')
    ax[1].plot(s3, color='r', label='S1')
    ax[1].plot(s4, color='b', label='S2')

class MonitorProxy:
    def __init__(self) -> None:
        pass

    def listen(self, name, storage):
        print(f"MONITOR RECEIVE {name} : {storage.keys()}")

        fig, ax = plt.subplots(len(storage),1)
        j = 0

        sin1 = sin(sr1,0,20)
        sin2 = sin(sr2,0,20)

        eeg = storage["s3"]["eeg"]
        ecg = storage["s4"]["ecg"]
        fig, ax = plt.subplots(2,1)
        ax[0].plot(sin1[:1000],color="r",label = "s1 asynchronous")
        ax[0].plot(sin2[:1000],color="b",label = "s2 asynchronous")
        ax[0].legend()

        ax[1].plot(eeg,color="r",label = "s1 synchronous")
        ax[1].plot(ecg,color="b",label = "s2 synchronous")
        ax[1].legend()
        plt.show()


sr2 = 1200
class ECGProxy:
    def __init__(self,name):
        self.name = name
    @staticmethod
    def getStreams():
        return [Stream("ecg",float, sr2)]

sr1 = 1000
class EEGProxy:
    def __init__(self,name):
        self.name = name
    @staticmethod
    def getStreams():
        return [Stream("eeg",float, sr1)]

def test():


    monitor = MonitorProxy()

    synchronizer = Synchronizer("Sync")
    synchronizer.connectToMonitor(monitor)

    s1 = EEGProxy("s1")
    s2 = ECGProxy("s2")

    synchronizer.input(s1, s2)
    s3 = EEGProxy("s3")
    s4 = ECGProxy("s4")
    synchronizer.output(s3, s4)

    sin1 = sin(sr1,0,20)
    sin2 = sin(sr2,0,20)


    synchronizer.connect(s1)
    synchronizer.connect(s2)

    synchronizer.buffer(s1, [sin1[:1000]])

    synchronizer.buffer(s2, [sin2[:1000]])
    synchronizer.buffer(s2, [sin2[1000:2000]])
    synchronizer.buffer(s2, [sin2[2000:3000]])
    synchronizer.buffer(s1, [sin1[1000:2000]])
    synchronizer.buffer(s1, [sin1[2000:3000]])
    #synchronizer.buffer("EEG",sin1[:1000])
    #synchronizer.buffer("ECG",sin2[:1000])
    #synchronizer.buffer("ECG",sin2[1000:2000])

    #sync_sin1, sync_sin2 = monitor.data_chunk[0],monitor.data_chunk[1]

    #plotSignals(sin1[:1000],sin2[:1000])

    #plotSignals(sync_sin1[:1000],sync_sin2[:1000])

    #compare(sin1[:1000],sin2[:1000],sync_sin1[:1000],sync_sin2[:1000])

    #plotRealSignals(sin1,sr1,sin2,sr2)


    #synchronizer.buffer("ECG",sin2[2000:3000])
    #synchronizer.buffer("ECG",sin2[3000:4000])
    #synchronizer.buffer("ECG",sin2[4000:5000])
    #sync_sin1, sync_sin2 = monitor.data_chunk[0],monitor.data_chunk[1]

    #plotSignals(sync_sin1[:1000],sync_sin2[:1000])

    #plt.show()





if __name__ == "__main__":
    test()
