# print(decimal(55055))
# print(decimal(-136))
# print(decimal(0))
# output:
# [0, 5, 5, 0, 5, 5]
# ['-', 0, 1, 3, 6]
# [0]



def decimal(n):
    if n==0:
        return [0]
    if n<0:
       li= decimalHelper(-1*n) #pass positive n
       li.insert(0,'-')# insert -
       return li
    return decimalHelper(n) # if n is positive
    
def decimalHelper(n):
  # base case
    if n==0:
        myList=[]
        return myList
    recusrsiveResult=decimal(n//10)# recursive call for smaller input n
    recusrsiveResult.append(n%10)#append last digit to recusrsiveResult list
    return recusrsiveResult # return recusrsiveResult

print(decimal(55055))
print(decimal(-136))
print(decimal(0))
