import java.util.*;
public class EnterANumberBetween5And10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("% java EnterANumberBetween5And10");
        while(true){
            System.out.print("enter a number between 5 and 10 (inclusive): ");
            if(sc.hasNextDouble()){
                // if number is double/real
                double num=sc.nextDouble();
                if(num>=5 && num<=10){
                    //check if number is double/real then check number in range between 5 and 10(inclusive)
                    // if yes print and break the loop
                    System.out.println("you entered a valid number: "+num);
                    break;
                }else{
                    //if number is double/real but not in given range then print that
                    System.out.println("you entered a bad number");

                }
            }else{
                // number is not double/real
                String num=sc.next();
                System.out.println(num+" is not a number");
            }
        }

    }
}
