import java.util.*;
public class Main
{   public static long convertOctalToDecimal(String octal){
    // base case if string is empty
     if(octal==""){
         return -9999;
     }
     if(octal.length()==1){// if length is 1
         if(octal.charAt(0)<'0' || octal.charAt(0)>'7'){ // cehck digit in range [0-7] or not
         return -9999;// if not in range return -9999
     }
         return Long.parseLong(octal);// just return 8^0*digit=digit
     }
     long smallResult=convertOctalToDecimal(octal.substring(1));// recusive call 
     if(smallResult==-9999){// if recursion smallResult  is -9999 just return -9999
         return smallResult;
     }
     if(octal.charAt(0)<'0' || octal.charAt(0)>'7'){// else check my 0 the char is valid
         return -9999;
     }
  // if valid just add my result to recusion result
     return Long.parseLong(String.valueOf(octal.charAt(0)))*(long)Math.pow(8,octal.length()-1)+smallResult;
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter octal: ");
		String octal=sc.next();
		System.out.println(convertOctalToDecimal(octal));
	}
}
