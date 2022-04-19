/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String secretWord="java";
	    System.out.print("guess the word: ");
	    String guess=sc.next();
	    if(guess.equals(secretWord)){
	           System.out.println("your guess is correct");
	       }else{
	           while(!guess.equals(secretWord)){
	               System.out.print("It is wrong guess, guess again: ");
	               guess=sc.next();
	           }
	           System.out.println("your guess is correct");
	       }
	}
}
