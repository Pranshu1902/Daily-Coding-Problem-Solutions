arr = [2, 1, 5, 7, 2, 0, 5]
median = [arr[0]]
ar = [arr[0]]
for i in range(1,len(arr)):
    # sorting the newly added element
    m=len(ar)
    for j in range(m):
        # the element is less than the (n-j)th element of ar
        if ar[m-j-1]<arr[i]:
            ar.insert(m-j, arr[i])
            break
        if m-j-1==0 and ar[m-j-1]>arr[i]:
            ar.insert(0,arr[i])
    n = len(ar)
    if len(ar)%2==1:
        median.append(ar[(n-1)//2])
    else:
        median.append((ar[n//2]+ar[(n//2)-1])/2)
print(median)
