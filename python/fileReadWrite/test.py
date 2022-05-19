import random
random.seed(25)
# writing data
f=open("test.txt",'w')
for i in range(0,1000):
    # Generated random number will be between 1 to 25.
    rand= random.randint(1, 25)
    f.write(str(rand)+"\n")
f.close()
   
# reading data

lines = []
with open('test.txt') as f:
    lines = f.readlines()# read all lines

results = list(map(int, lines))#Convert all strings in a lines list to int
sum=sum(results)# find sum of results list
print("average is: ",sum/1000)
print("minimum number in file: ",min(results))
print("maximum number in file: ",max(results))
   
