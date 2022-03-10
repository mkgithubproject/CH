studentsName=[] # list which have students names
gradesOfStudents=[]# list which hold students grade
scoreOfStudents=[]# list of list ,it will has list of scores of 4 subjects marks of students

for i in range(0,5):# add students names
    name=str(input("Enter student_"+str(i+1)+" name : "))
    studentsName.append(name);
    
num_of_students=5
while num_of_students>=1:# add students marks set in the scoreOfStudents list
    scoreOfStudent=[]
    for i in range(0,4):
        mark=float(input("Enter student_"+str(5-(num_of_students-1))+" marks of test_"+str(i+1)+": "))
        if(mark<0 or mark>100):
            print("Inavlid entered marks re-enter again:")
            while mark<0 or mark>100:
                 mark=float(input("Enter student_"+str(5-(num_of_students-1))+" marks of test_"+str(i+1)+": "))
                 if(mark<0 or mark>100):
                     print("Inavlid entered marks re-enter again:")
            
        else:
            scoreOfStudent.append(mark)
    scoreOfStudents.append(scoreOfStudent)
    num_of_students=num_of_students-1
print("Student average Score\tStudent grade")
for i in range(0,5):# find out grade of students and display avera score as well as grades 
    innerScoreList=scoreOfStudents[i]
    totalScore=0
    for j in range(0,4):
       totalScore=totalScore+innerScoreList[j]
    if((totalScore/4)>=90 and (totalScore/4)<=100 ):
        gradesOfStudents.append('A')
    elif((totalScore/4)>=80 and (totalScore/4)<90 ):
        gradesOfStudents.append('B')
    elif((totalScore/4)>=70 and (totalScore/4)<80 ):
        gradesOfStudents.append('C')    
    elif((totalScore/4)>=60 and (totalScore/4)<70 ):
        gradesOfStudents.append('D')
    else:
        gradesOfStudents.append('F')
    
    print(str((totalScore/4))+"\t"+gradesOfStudents[i])

    
    
