import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int min=48;
	    int max=122;
	    String str="";
	    int counter=1;
	    int characterS=0;
	    int digitS=0;
	    int letterS=0;
	    int lowerCaseLetters=0;
	    int upperCaeLetters=0;
	    int notDigitNotLetters=0;
	    char ch;
	    while(counter<=100){
	         int randomNumber = (int) (Math.random()*(max-min+1)) + min;// generate random number
	         str=str + (char)randomNumber; // concate a char into String
	         counter++;// increment counter value
	    }
	    System.out.println(str);//print String
	    characterS=str.length();
	    for(int i=0;i<str.length();i++){
	        ch=str.charAt(i);
	        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				letterS++;
				if(ch >= 'A' && ch <= 'Z'){
				    upperCaeLetters++;
				}else{
				    lowerCaseLetters++;
				}
			}
	    
	    else if(ch >= '0' && ch <= '9') {
				digitS++;
			}else{
			    notDigitNotLetters++;
			}
	    }
	    // display results
	    System.out.println("Total Number of characters: "+characterS);
	    System.out.println("Total Number of digits: "+digitS);
	    System.out.println("Total Number of letters: "+letterS;
	    System.out.println("Total Number of upper-case letters: "+upperCaeLetters);
	    System.out.println("Total Number of lower-case letters: "+lowerCaseLetters);
	    System.out.println("Total Numberof characters not a letter or digit: "+notDigitNotLetters);
	}
}
