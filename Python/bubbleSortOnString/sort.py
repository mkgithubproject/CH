def alphabetical_by_last(li):
    # apply bubule sort
    for i in range(len(li)-1):
        for j in range(len(li)-i-1):
            if(li[j][len(li[j])-1]>li[j+1][len(li[j+1])-1]):
                #means first string is >second
                # swap them
                temp=li[j]
                li[j]=li[j+1]
                li[j+1]=temp;
            elif li[j][len(li[j])-1]==li[j+1][len(li[j+1])-1]:
                # if last char of string are same
                #find index where charcater are not same of both strings from last
                str1=li[j]
                str2=li[j+1]
                str1Index=len(str1)-1
                str2Index=len(str2)-1
                unmatchedCharIndex=-1
                while str2Index>=0 and str1Index>=0:
                    if str1[str1Index]!=str2[str2Index]:
                        unmatchedCharIndex=str1Index
                        break
                    str1Index=str1Index-1
                    str2Index=str2Index-1
                if(li[j][unmatchedCharIndex]>li[j+1][unmatchedCharIndex]):
                    #means first string is >second
                    # swap them
                    temp=li[j]
                    li[j]=li[j+1]
                    li[j+1]=temp;
    return li
    




print(alphabetical_by_last(["cat","dog","fox","elk","bat"]))

