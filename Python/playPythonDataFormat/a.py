firstHouseCost=float(input("Input the initial cost of the first house: "));# take input house cost
firstHouseFuelCost=float(input("What is the annual fuel cost of the first house? "))# take input fuel cost
firstHouseTaxRate=float(input("Tax rate of the first house? "))# take input tax rate
print("\n")
secondHouseCost=float(input("Input the initial cost of the second house: "));
secondHouseFuelCost=float(input("What is the annual fuel cost of the second house? "))
secondHouseTaxRate=float(input("Tax rate of the second house? "))
print("\n")
thirdHouseCost=float(input("Input the initial cost of the third house: "));
thirdHouseFuelCost=float(input("What is the annual fuel cost of the third house? "))
thirdHouseTaxRate=float(input("Tax rate of the third house? "))
print("\n")
# calculate house rates
houses=[[firstHouseCost,firstHouseFuelCost*5,firstHouseTaxRate*firstHouseCost*5,firstHouseCost+firstHouseFuelCost*5+firstHouseTaxRate*firstHouseCost*5],
[secondHouseCost,secondHouseFuelCost*5,secondHouseTaxRate*firstHouseCost*5,secondHouseCost+secondHouseFuelCost*5+secondHouseTaxRate*firstHouseCost*5],
[thirdHouseCost,thirdHouseFuelCost*5,thirdHouseTaxRate*thirdHouseCost*5, thirdHouseCost+thirdHouseFuelCost*5+thirdHouseTaxRate*thirdHouseCost*5],
]

#display results
print("{:<20} {:<20} {:<18} {:<15}".format("INITIALHOUSE COST", "ANNUAL FUEL COST", "TAXES", "TOTAL COST"))# header
for houseData in houses:
    houseCost, FuelCost, taxes,totalCost = houseData
    print ("{:<20} {:<20} {:<18} {:<15}".format( "$"+str("{:,.2f}".format(houseCost)), "$"+str("{:,.2f}".format(FuelCost)), "$"+str("{:,.2f}".format(taxes)),"$"+str("{:,.2f}".format(totalCost))))

