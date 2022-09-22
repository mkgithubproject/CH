import random

size=int(input("How many values to put in the tuple? ")) # read size
startRange=int(input("What is the start of the range? ")) # read starting range of random integers
endRange=int(input("What is the end of the range? "))# read end range of random integers
listOfRandomIntegers=[] # created empty list
for i in range(0,size):# iterate till size
    randomNum=random.randint(startRange,endRange)# generate random number
    listOfRandomIntegers.append(randomNum)# append to list

tupleOfNumbers=tuple(listOfRandomIntegers)# convert list to tuple
print("Tuple of 7 random numbers:",tupleOfNumbers)# print tuple

tuple2=tuple(tupleOfNumbers[0:3])# tuple of first three numbers
tuple3=tuple(tupleOfNumbers[size-3:size+1])#tuple of last three numbers
tuple4=tuple2+tuple3# concatenate tuple
sorted_tuple_4 = tuple(sorted(tuple4))# sort the tuple

#print data
print("Tuple of first 3 numbers:",tuple2)
print("Tuple of last 3 numbers:",tuple3)
print("Two tuples concatenated:",tuple4)
print("Two tuples concatenated and sorted:",sorted_tuple_4)
