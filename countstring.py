a="aaabccdedasdgcvfwcbmyteoopas"
count=[0]*256
if len(a) != 0:
    for i in range(len(a)):
        count[ord(a[i])] += 1
    
    n=len(a)
    for i in range(n):
        if count[ord(a[i])]==1:
            print(a[i])
            
else:
    print("empty string")
    
