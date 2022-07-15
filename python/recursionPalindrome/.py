def main():
    text=input("Enter text: ")
    print(palindromes(text))
    print(count_palindromes(text))
    
def palindromes(text):
    listOfBool=[]
    list=text.split(" ")
    for i in range(len(list)):
        listOfBool.append(_checkIsPalindrom(list[i],0,len(list[i])-1))
    return listOfBool
    
def _checkIsPalindrom(word,startIndex,endIndex):
    if startIndex==endIndex:
        return True
    if word[startIndex]!=word[endIndex]:
        return False;
    return _checkIsPalindrom(word,startIndex+1,endIndex-1)

def count_palindromes(text):
    count=0
    list=text.split(" ")
    for i in range(len(list)):
       if  _checkIsPalindrom(list[i],0,len(list[i])-1):
           count=count+1
    return count
    
    
    
if __name__ == '__main__':
    main()
