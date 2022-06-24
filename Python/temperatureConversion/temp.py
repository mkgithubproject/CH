startTempCelcius=float(input("Enter starting Celsius temperature: "))# read temp in celcius
while startTempCelcius <(-273):# read till user does enter temp greater than -273
    startTempCelcius=float(input("Error: Temperature cannot to below absolute zero. Please reenter!: "))

print("Temperature conversions using while lopp")
lastTempCelcius=startTempCelcius+20
print ("{:<8} {:<15} {:<10}".format('Cels','Fahr','Kelvin'))
temp=startTempCelcius
while temp<=lastTempCelcius:# print temp convertion using while loop
    fah=((9*temp)/5)+32# convert celcius to fahrnehite
    kelvin=temp + 273.15# convert to kelvin
    print("{:<8} {:<15} {:<10}".format(round(temp,2),round(fah,2),round(kelvin,2)))# print temps
    temp=temp+1

print("\nTemperature conversions using a for loop")
print ("{:<8} {:<15} {:<10}".format('Cels','Fahr','Kelvin'))
for i in range(21):# print temp using fior loop
    fah=((9*startTempCelcius)/5)+32
    kelvin=startTempCelcius+ 273.15
    print ("{:<8} {:<15} {:<10}".format(round(startTempCelcius,2),round(fah,2),round(kelvin,2)))
    startTempCelcius=startTempCelcius+1
