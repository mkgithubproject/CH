import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
       int tries=1;// initialize tries variable with 1
       int computerGeneratedNmber=rand.nextInt(10)+1;// gereate random number 1 to 10
       System.out.println("Guess anumber from 1-10. ");
       if(sc.hasNextInt()){
           int guess=sc.nextInt();// user input
            while(tries<5){// user can only 5 tries.
            if(guess>computerGeneratedNmber){
                System.out.println("This answer is too high! Please try again.");
            }else if(guess<computerGeneratedNmber){
                 System.out.println("This answer is too low! Please try again.");
            }else{
                 System.out.println("This is correct! this number is "+computerGeneratedNmber+".");
                 break;
            }
            if(sc.hasNextInt()){
               guess=sc.nextInt();
            }
            tries++;
        }
        if(tries==5){
           System.out.println("You have used all the tries."); 
        }
       }
       
    }
}
