def Add(num1, num2):
   addition = num1 + num2
   return addition
def Sub(num1, num2):
   subtract = num1 - num2
   return subtract
def Mult(num1, num2):
   multiply = num1 * num2
   return multiply
def Div(num1, num2):
    if num2==0:# if num2 is zero then raise a exception can not divide zero
        raise ValueError("Cannot divide by zero, Please try again")
    else:# else return division of both number
        division=num1/num2
        return division
def isinrange(highrange, lowrange, num1, num2):
    if num1 <= lowrange:
       return -1# num1 and num2 not in range return -1 means they are in range else return 0
    elif num2 >= highrange:
       return -1
    else:
        return 0

def calculate():
   lowrange = int(input("Enter the minimum value you wish to accept  --> "))
   highrange = int(input("Enter the maximum value you wish to accept --> "))
   num1 = int(input("Enter your first number: "))
   num2 = int(input("Enter your Second number: "))
   checkInRange=isinrange(highrange,lowrange,num1,num2)
   if checkInRange==-1:# if isinrange returns -1 means they are not in range
       print("The input values are outside the input ranges, please try again.")
   else:# else they are in range and perform given below tasks
       addition = float(Add(num1,num2))# call Add function which will return addition of num1 and num2
       subtract = float(Sub(num1,num2))# call Sub function
       multiply = float(Mult(num1,num2))# call Mult function
       print(" The result of ", num1, "+", num2, "=", addition)# print addition
       print(" The result of ", num1, "-", num2, "=", subtract)# print subtraction
       print(" The result of ", num1, "*", num2, "=", multiply)# print multiply
       try:# handled exception if Div function raises exception then handle it 
           division = float(Div(num1,num2))
           print(" The result of ", num1, "/", num2, "=",division)# if not exception found print division
       except ValueError as ve:# catch exception
           print(" The result of ", num1, "/", num2, "=",ve)
       
       

   try_again()# call try_again function if you wish to continue
def try_again():
   while True:
       again = input("Would you like to make another calculation? y/n: ")
       if again == "n":
           print("Thank you for using my calculator")
           return
       elif again == "y":
            calculate()

calculate()
