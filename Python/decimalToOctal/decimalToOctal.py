
def decimalToOctal(decimal):
    octal = 0
    i = 1
    while (decimal != 0):
        rem=decimal%8# extract octal value 
        octal = octal + rem * i #
        decimal = int(decimal / 8)# remove last digit from decimal
        i = i * 10
    return octal

decimal = int(input("Enter a decimal number :"))

print("Octal value of ",decimal,"is",decimalToOctal(int(decimal)))
