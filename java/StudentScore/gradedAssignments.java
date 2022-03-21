//package grades;
import java.util.Scanner;
/*
 * Student Name : Marina Sutton
 * Course Name : ISM510 Introduction to Computer Programming for Business Applications (ISB2209A)
 * Week 4 Assignment
 * Assignment Date: 03/20/2022
 */
public class gradedAssignments {
    public static boolean checkScore(int score){
        if(score<0 || score>100){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        boolean flag =true;
        int totalStudentCount = 0;
        double classScoreAverage = 0;
        while(flag){
            Scanner s = new Scanner (System.in);
            System.out.println("Enter Student's Name:");
            String name = s.next ();
            System.out.println("Enter Student's Test Score:");
            int score1 = s.nextInt();
            //check if user has entered valid input
            boolean isValidScore = checkScore(score1);
            while(!isValidScore){
                System.out.println("Score entered is invalid, please reenter score.");
                score1 = s.nextInt();
                //Ask again for user input
                isValidScore= checkScore(score1);
                //check again
            }
            String letterGrade;
            double scorepercentage = (double)score1/100;

            classScoreAverage = classScoreAverage + score1;

            System.out.println ("Student's Name:" + name);

            if ((scorepercentage >= 0.93)&& (scorepercentage <= 1.0))
                letterGrade = "A";
            else if ((scorepercentage >= 0.90)&& (scorepercentage <= 0.93))
                letterGrade = "-A";
            else if ((scorepercentage >= 0.87)&& (scorepercentage <= 0.90))
                letterGrade = "+B";
            else if ((scorepercentage >= 0.83)&& (scorepercentage <= 0.87))
                letterGrade = "B";
            else if ((scorepercentage >= 0.80)&& (scorepercentage <= 0.83))
                letterGrade = "-B";
            else if ((scorepercentage >= 0.77)&& (scorepercentage <= 0.80))
                letterGrade = "+C";
            else if ((scorepercentage >= 0.73)&& (scorepercentage <= 0.77))
                letterGrade = "C";
            else if ((scorepercentage >= 0.70)&& (scorepercentage <= 0.73))
                letterGrade = "-C";
            else if ((scorepercentage >= 0.67)&& (scorepercentage <= 0.70))
                letterGrade = "+D";
            else if ((scorepercentage >= 0.63)&& (scorepercentage <= 0.67))
                letterGrade = "D";
            else if ((scorepercentage >= 0.60)&& (scorepercentage <= 0.63))
                letterGrade = "-D";
            else {
                letterGrade = "F";
            }


            totalStudentCount++;
            System.out.println("Letter Grade is:" + letterGrade);
            System.out.println (" Would you like to change another "
                    + "student's grade? : Enter YES to Continue or Enter NO to Exit.");
            String response = s.next ();
            if (response.equalsIgnoreCase("NO"))
                flag = false;
        }
        System.out.println("Total number of students:" + totalStudentCount);
        System.out.println("Average score of class:" + classScoreAverage/totalStudentCount);

    }


}

