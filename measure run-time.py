import os
import sys
from timeit import default_timer as timer

def comparetriplets(a,b):
        na=0
        nb=0
        for i in range(len(a)):
            if a[i] > b[i]:
                na +=1
            elif a[i] < b[i]:
                nb += 1
            else:
                pass
        return([na,nb])
     
a= [17,28,8,10,14,5]
b= [9,8,18,12,5,20]

start = timer()
print(comparetriplets(a,b))
stop = timer()
print("elasped",stop-start)
