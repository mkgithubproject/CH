def is_anagram(str1,str2):
    if len(str1)!=len(str2):# if length is not same of both string just return false they never be anagram
        return False
    if len(str1)==0 and len(str2)==0:
        return True
    index=str2.find(str1[0])
    
    if index==-1:
        return False
    return is_anagram(str1[1:],str2[0:index]+str2[index+1:len(str2)])# recursive call for smaller input


print(is_anagram("meat","team"))
print(is_anagram("stay","says"))
print(is_anagram("judos","JUDOS"))
