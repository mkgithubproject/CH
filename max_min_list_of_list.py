def max_min_sum_List(list1):
    maxListSum=float('-inf')
    maxList=[]
    minListSum=float('inf')
    minList=[]
    # traversal in the lists
    for x in list1:
        sum = 0 
        # traversal in list of lists
        for y in x:
            sum+= y     
        if(sum>maxListSum):
            maxListSum=sum
            maxList=x
        if(sum<minListSum):
            minListSum=sum
            minList=x
    
    return [maxList,minList]    

listReult=max_min_sum_List([[1,2,3,5],[2,3,5,4],[0,5,4,1],[1,2,1,2]])

print("Maximum sum of sub lists::")
print(listReult[0]) # output[2,3,5,4]
print("Minimum sum of sub lists::")
print(listReult[1])  # output[1,2,1,2]
