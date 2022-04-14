import java.util.*;
public class ReverseString {

    public static String reverse(String str) throws InvalidStringException {
          // base case
            if(str.length()==0){
                return str;
            }
            // extract index 0 value
            char firstChar=str.charAt(0);
            int num;
            // if at index 0 , value is not numeric just throw an exception. Note parse int method returns an exception if given string is not numeric type
            try{
                 num=Integer.parseInt(String.valueOf(firstChar));
            }
            catch (NumberFormatException e){
                // throw InvalidStringException which is user defined type exxception
                throw new InvalidStringException();
            }
            // if num is even increment its value by 1
            if(num%2==0){
                num=num+1;
            }
            // recursive call
            return reverse(str.substring(1))+""+num;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string for which you want to reversed string");
        String str=sc.next();
        try{
        System.out.println(reverse(str));}
        catch(InvalidStringException e){
            System.out.println(e.getMessage());
        }
    }
}
