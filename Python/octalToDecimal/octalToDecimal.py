

def octalToDecimal(octalNum):
	decimalValue = 0
	# Initializing placeValue value 1 means unit place would be 8^0=1 because octal number has base value 8
	placeValue = 1
	while (octalNum):
		# extract last digit from octal
		last_digit = octalNum % 10
		octalNum = int(octalNum/10)# remove last digit from octalNum
		decimalValue =decimalValue+ last_digit * placeValue	# Multiplying last digit by appropriate base value and add result to decimalValue
		placeValue = placeValue * 8# update place value 8^1=8.... so on
	return decimalValue


# Driver Code
num = input("Enter an octal number: ")
print("Decimal value of ",num,"is",octalToDecimal(int(num)))
