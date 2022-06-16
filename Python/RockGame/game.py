import random
userWon=0
computerWon=0
tie=0
rock=0
paper=0
scissor=0
def playGame(userTurnValue):
    global userWon
    global computerWon
    global tie
    global rock
    global paper
    global scissor
    computerTurnValue = random.randint(0, 2)#will give 0 or 1 or 2 means Generate computer's play (0,1,2) 
    computer=""
    user=""
    if(computerTurnValue==0):
        computer="scissor"
    elif(computerTurnValue==1):
        computer="rock"
    elif(computerTurnValue==2):
        computer="paper"
    if(userTurnValue==0):
        user="scissor"
        scissor+=1
    elif(userTurnValue==1):
        user="rock"
        rock+=1
    elif(userTurnValue==2):
        user="paper"
        paper+=1
    if(userTurnValue==computerTurnValue):
        print("The computer is "+computer+". You are "+user+". It is a draw")
        tie+=1
    elif(userTurnValue==1):
        if(computerTurnValue==0):
            print("The computer is "+computer+". You are "+user+". You won")
            userWon+=1
        elif(computerTurnValue==2):
            print("The computer is "+computer+". You are "+user+". You won")
            userWon+=1
    elif(userTurnValue==2):
        if(computerTurnValue==0):
            print("The computer is "+computer+". You are "+user+". You loose")
            computerWon+=1
        elif(computerTurnValue==1):
            print("The computer is "+computer+". You are "+user+". You won")
            userWon+=1
    elif(userTurnValue==0):
        if(computerTurnValue==2):
            print("The computer is "+computer+". You are "+user+". You won")
            userWon+=1
        elif(computerTurnValue==1):
            print("The computer is "+computer+". You are "+user+". You loose")
            computerWon+=1
    else:
        print("Invalid user input")
while True:
    print("R or r (Rock)")
    print("P or p (Paper))")
    print("S or s (Scissors)")
    print("Q or q (Quit)")
    choice=input()
    #"scissor(0), rock(1), paper(2)"
    if choice=='Q' or choice=='q':
        print("Tie matches:",tie)
        print("User won:",userWon)
        print("Computer won:",computerWon)
        print("User used scissor weapon:",scissor)
        print("User used paper weapon:",paper)
        print("User used rock weapon:",rock)
        break
    elif choice=='R' or choice=='r':
        playGame(1)
    elif choice=='P' or choice=='p':
        playGame(2)    
    elif choice=='S' or choice=='s':
        playGame(0) 
    else:
        print("Invalid choice")
    
