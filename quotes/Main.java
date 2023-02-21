import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Please enter an integer for the day of the week (0-6): ");
		int num=sc.nextInt(); // read Integer number
		// switch statement
		switch(num){
		    case 1:
		        System.out.println(num+" is Monday");
		        break;
		    case 2:
		        System.out.println(num+" is Tuesday");
		        break;
    		case 3:
		        System.out.println(num+" is Wednesday");
		        break;
		    case 4:
		        System.out.println(num+" is Thrusday");
		        break;
		    case 5:
		        System.out.println(num+" is Friday");
		        break;
		    case 6:
		        System.out.println(num+" is Saturday");
		        break;
		    case 7:
		        System.out.println(num+" is Sunday");
		        break;
		    default:
		       System.out.println("Invalid input");
    		}
    	System.out.println("\nPlease enter two numbers for max and min:");
    	double num1=sc.nextDouble(); // read num1
    	double num2=sc.nextDouble(); // read num2
    	// print max and min
    	System.out.println("The minimum is "+Math.min(num1,num2)+" and the maximum is "+Math.max(num1,num2));
    	System.out.println("\nPlesae enter a number to be square-rooted:");
    	num1=sc.nextDouble(); // reda num1
    	System.out.println("The square root of "+num1+" is "+Math.sqrt(num1)); // print square-rooted
    	System.out.println("\nPlease enter a base:");
    	num1=sc.nextDouble(); // read base
    	System.out.println("Please enter a power:");
    	num2=sc.nextDouble(); // read power
    	// print power
    	System.out.println("The base "+num1+" raised to the power of "+num2+", rounded to the nearest whole number, is "+Math.round(Math.pow(num1,num2)));
    	System.out.println("\nPlease enter an integer between 1-26:");
    	num=sc.nextInt(); // read num between 1-26
    	System.out.println("Letter "+num+" is: "+(char)(96+num)); // print corresponding charcater
    	System.out.println("\nPlease enter a lower case character:");
    	char ch=sc.next().charAt(0); // read character
    	System.out.println("Letter in uppercase is "+Character.toUpperCase(ch)); // print that char in uppercase
    	System.out.println("\nPlease enter your last name:");
    	String lName=sc.next(); // read last name
    	System.out.println("Please enter an adjective for java:");
    	String adj=sc.next(); // read adjective
    	// print quote
    	System.out.println("Here's my quote:");
    	System.out.println("\t\"Programming is \'"+adj+"\' for those that work hard.\" - "+lName+" "+'\u263A');
    	
	}
}
