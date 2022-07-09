#user intrface
print("Temerature Conversions")
print("\n\n1) Celcius to Fahrenheit")
print("2) Fahrenheit TO Celcius")
print("3) Quit")
while(True):
    choice=int(input("Enter your choice: "))# read choice
    while(choice<1 and choice>3):# if choice less than 1 and greater than 3 show error messsage and read till 
                                 #user does not print correct value
        print("Error: invalid selection, Please reenter")
        choice=int(input("Enter your choice: "))# read again
    if(choice==3):# break the loop if choice is 3
        print("Thank you for using the program")
        break
    elif(choice==1):# if choice==1 read temp and convert Celcius to Fahrenheit
        print("Convert Celcius to Fahrenheit")
        temp=float(input("Enter the Celcius Temerature to convert: "))
        while(temp<0):
            print("Error- temp below absolute zero. Please reenter!")
            temp=float(input("Enter the Celcius Temerature to convert: "))
        print(temp,"degrees Celcius is",round((temp*1.8)+32,2),"degrees Fahrenheit.")
    elif(choice==2):# if choice 2 read correct temp value and Convert Fahrenheit to Celcius
        print("Convert Fahrenheit to Celcius")
        temp=float(input("Enter the Fahrenheit Temerature to convert: "))
        while(temp<0):
            print("Error- temp below absolute zero. Please reenter!")
            temp=float(input("Enter the Fahrenheit Temerature to convert: "))
        print(temp,"degrees Fahrenheit is",round((temp-32)*.5556,2),"degrees Celcius.")
    
        
        
