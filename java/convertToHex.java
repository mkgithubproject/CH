import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Input: ");
	    int num;
	  
       while(!sc.hasNextInt()){
	    System.out.print("Enyered output is not integer! Kindly enter an integer: ");
	    sc.next();
       }
		num=sc.nextInt();
		String hex="";
		while(num>0){
		    int rem=num%16;
		    if(rem>9){
		        rem=55+rem;
		        hex=(char)rem+hex;
		    }else{
		       hex=rem+hex; 
		    }
		    num=num/16;
		}
	
		System.out.print("output: "+hex);
	}
}
