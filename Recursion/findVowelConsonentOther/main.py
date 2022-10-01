def RecurrCount(s):
    # base case if length of s is zero just return  list with 0 values
    if len(s)==0:
        li=[0,0,0]
        return li
    
    recursiveList=RecurrCount(s[1:])
    
    ch=s[0].lower()# i will work for 0th character, for rst recursion will handle ,converted to lower for handle upper case
    
    if ch>='a' and ch <='z': # if 0th char is alphabet
        # if it is vowel
        if (ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u'):
            recursiveList[1]=recursiveList[1]+1 # update vowel count
        
        #else it is consonent
        else:
            recursiveList[0]=recursiveList[0]+1
    #for others
    else:
        recursiveList[2]=recursiveList[2]+1
    
    return recursiveList
    

print(RecurrCount("abc de"))
print(RecurrCount("To be or not to be"))



    
    
