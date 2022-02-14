def helper(vals1,vals2,List,index):
    if len(vals1)==0 or len(vals2)==0:
        return List
    
    if len(vals1)==index or len(vals2)==index:
        return List
    if vals1[index]<=vals2[index]:
        
        List.append(vals1[index])
        
    else:
       
       List.append(vals2[index])
        
    return helper(vals1,vals2,List,index+1)
    
    
def smaller_of(vals1,vals2):
    List=[]
    return helper(vals1,vals2,List,0)

print(smaller_of([3,4,9,5],[7,2,0,5])) # output [3,2,0,5]
print(smaller_of([5,7,2],[1,9,15]))
print(smaller_of([],[]))
print(smaller_of([0,3,6,9],[1,1]))
print(smaller_of([3,1,0],[2,4,5,6]))
print(smaller_of([1,2],[]))
print(smaller_of([],[3,4,5]))
