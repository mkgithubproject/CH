import java.util.Scanner;

public class BigIntegerAdder {
    private static String add(LinkedStack s1, LinkedStack s2) {
        String result="";
        int sum=0;
        int carry=0;
        while(!s1.isEmpty() && !s2.isEmpty()){
            // traverse both stack till both are not empty
            int num1=s1.pop();// pop num1
            int num2=s2.pop();// op num2
             sum=num1+num2+carry;// add both num1 and num2 and carry
            carry=sum/10;// update carry for example num1=8 and num2=9 and carry =0 then sum=8+9+0=17 then carry will be 17/10=1
            int remainder=sum%10;// find remainder for example sum=17, 17%10=7 add 7 to result
            result=remainder+result;// update result
        }
        // if anyone stacks gets empty then add rest of digits into result
        while (!s1.isEmpty()){
            sum=s1.pop()+carry;
            carry=sum/10;
            int remainder=sum%10;
            result=remainder+result;
        }
        while (!s2.isEmpty()){
            sum=s2.pop()+carry;
            carry=sum/10;
            int remainder=sum%10;
            result=remainder+result;
        }
        if(carry==1){
            result=carry+result;
        }
        return result;
    }

    public static void readNumber(LinkedStack s) {
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter a very large positive number.");
        num=sc.next();// read input from user
        // push all the digits of string into linked stack
        for(int i=0;i<num.length();i++){
            s.push(num.charAt(i)-'0');
        }
    }
    public static void main(String[] args) {
        LinkedStack s1=new LinkedStack();
        LinkedStack s2=new LinkedStack();
        readNumber(s1);
        readNumber(s2);
        String result=add(s1,s2);
        System.out.println("Sum=" + result);
    }


}
