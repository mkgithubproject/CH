def convertCtoF(c):
    F = (9/5)*c + 32
    return F
 
def convertFtoC(f):
    C=((f-32)*5)/9
    return C  
def areaOfCircle(radius):
    return 3.14*radius*radius

while True:
    print("1.conversion celcius to Fahrenheit")
    print("2.conversion Fahrenheit to celcius")
    print("3.aREA of circle")
    num = int(input("Select a number from given above catagories:"))
    if num==1:
            cel = float(input("Enter the temperature in celcius: "))
            Fah = convertCtoF(cel)
            print ("The temperature in Fahrenheit is ", Fah)
    elif num==2:
            fah = float(input("Enter the temperature in Fahrenheit: "))
            cel = convertFtoC(fah)
            print ("The temperature in Fahrenheit is ", cel)
           
    elif num==3:
            rad = float(input("Enter the radius of circle: "))
            area = areaOfCircle(rad)
            print ("The area of circle  is ", area)
            
    else:
            print("Invalid choice: ")
            
    if input('Do You Want To Continue? [y/n]') != 'y':
        break
    
