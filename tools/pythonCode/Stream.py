""" 
class Stream : It defines a stream, its type and sample rate.
"""
class Stream:
    def __init__(self,name,type,sample_rate):
        self.name = name
        self.type = type
        self.sample_rate = sample_rate
