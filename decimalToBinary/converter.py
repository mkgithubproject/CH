def convertDecimalToBinary(low,high):
    print("Decimal\tBinary")
    for i in range(low, high+1):
        print(i,"\t",bin(i).replace("0b", ""))
    
def convertDecimalToOctal(low,high):
    print("Decimal\tOctal")
    for i in range(low, high+1):
        print(i,"\t",oct(i).replace("0o", ""))

def convertDecimalToHexadecimal(low,high):
    print("Decimal\tHexadecimal")
    for i in range(low, high+1):
        print(i,"\t",hex(i).upper().replace("0X", ""))
           
# take the low and high integer input from the user
low = int(input("Enter the low number: "))
high = int(input("Enter the high number: "))
convertDecimalToBinary(low,high)
convertDecimalToOctal(low,high)
convertDecimalToHexadecimal(low,high)
