def smallest(list):
    list.sort() # sort the list
    i=0
    while(i<len(list)-1):
        if(list[i]!=list[i+1] and list[i]+1!=list[i+1] and list[i]+1>0):
            return list[i]+1
        i=i+1
    # after termination of while loop check last element of list is negative then return positive integer else return last element +1
    if(list[len(list)-1]<0):
        return list[len(list)-1]+abs(list[len(list)-1])+1
    else:
        return list[len(list)-1]+1 
        
print(smallest([1,3,6,4,1,2]))# output 5
print(smallest([1,2,3]))# output 4
print(smallest([-1,-3]))# output 1
