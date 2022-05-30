import java.util.*;
public class Main
{   public static int  check_digit(String str){
    if(str.length()!=8){
      System.out.println("Invalid string...String must contain 8 characters.");
      return -1;// for invalid string return -1
    }
    if(Character.isDigit(str.charAt(0))){
        System.out.println("Invalid string...The first character must be alphabet.");
        return -1;// for invalid string return -1
    }
    for(int i=0;i<str.length();i++){
        // for checking Only allow 0 to 9 and A-Z (upper case)
        char c = str.charAt(i);
        if (!Character.isDigit(c)) {
            if(!(c >= 'A' && c <= 'Z')){
                System.out.println("Invalid string...");
                return -1;// for invalid string return -1
            }
        }
        
    }
    
    int arr[]=new int[91];//ASCII code for A to Z starts from 65(A) to 90(Z)
    int k=0;
    char ch='A';
    for(int i=0;i<26;i++){
        if(k==10){
            k=0;
        }
        arr[ch]=k;
        ch++;
        k++;
    }
    // CALCULATE CHECK-DIGIT
    int total=0;
    for(int i=0;i<str.length();i++){
         ch=str.charAt(i);
        if(Character.isDigit(ch)){
            total=total+Integer.parseInt(String.valueOf(ch));
        }else{
            total=total+arr[ch];
        }
    }
    int rem=total%11;
    if(rem==0 || rem==10){
        return 0;
    }else{
        return rem;
    }
    
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println(check_digit(str));
	}
}
