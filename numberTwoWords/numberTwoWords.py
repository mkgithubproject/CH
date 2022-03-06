numTwoWords1 = {0:'Zero',1: 'One', 2: 'Two', 3: 'Three', 4: 'Four', 5: 'Five', \
            6: 'Six', 7: 'Seven', 8: 'Eight', 9: 'Nine', 10: 'Ten', \
            11: 'Eleven', 12: 'Twelve', 13: 'Thirteen', 14: 'Fourteen', \
            15: 'Fifteen', 16: 'Sixteen', 17: 'Seventeen', 18: 'Eighteen', 19: 'Nineteen'}
numTwoWords2 = ['Twenty', 'Thirty', 'Forty', 'Fifty', 'Sixty', 'Seventy', 'Eighty', 'Ninety']

def number(Number):

    if (Number >= 0) and (Number <= 19):
        return (numTwoWords1[Number])
    elif (Number >= 20) and  (Number <= 99):
        remainder =int(Number%10)
        tens=int(Number/10)
        if remainder==0:
            return numTwoWords2[tens-2]
        else:
            return numTwoWords2[tens - 2] + ' ' + numTwoWords1[remainder]
    elif (Number >= 100) and  (Number <= 999):
        remainder1 =int(Number%100)
        if(remainder1==0):
            hundred=int(Number/100)
            return numTwoWords1[hundred]+" hundred"
        else:
            tensRemainder=int(Number%100)
            hundred=int(Number/100)
            return numTwoWords1[hundred]+" hundred "+number(tensRemainder)
            
    else:
        print("Number Out Of Range")

def main():
    num = eval(input("Please enter a number between 0 and 999: "))
    print(number(num))
main()
