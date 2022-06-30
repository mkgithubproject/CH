import java.util.*;
public class AddingRecursively2 {
    public static int sumRecursively(int first, int second){
        // base case
        //first become equal to second just return second
        if(first== second){
            return second;
        }
        // recursion call ,hey recursion give me sum between (first+1,second)
        int smallSum=sumRecursively(first+1,second);
        int sum=smallSum+first;// recursive step add first number to recursion sum and return it.
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first=sc.nextInt();// read first number
        System.out.print("Enter another number that is larger: ");
        int second=sc.nextInt();// read second number
        int sum;
        if(first>second){
            sum=sumRecursively(second,first);// call the function
        }else if(second>first){
            sum=sumRecursively(first,second);// call the funtion
        }else{
            sum=first+second;
        }
        System.out.print("The sum of all the numbers between "+
         first+" and "+ second+" is "+sum);
    }
}
