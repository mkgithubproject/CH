import java.util.*;
public class Excercise2 {
    // NumberOutOfRangeException class
    static class NumberOutOfRangeException extends Exception{
        private String message;
        // argument oriented constructor, if you want to paas a msg manually
        public NumberOutOfRangeException(String msg){
            this.message=msg;
        }
        public NumberOutOfRangeException() {
            this.message="Number out of range. Must be in 1..100 ";
        }
    }
    public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        int num=-1;
         do{
             System.out.print("Enter int in range 1..100 inclusive: ");
             try{
                  num=kbd.nextInt();
                 if(num>100 || num<0){
                     // if num out of range throw an exception
                     throw new NumberOutOfRangeException();
                 }
                 System.out.format("Thank you. You entered %d\n", num);
             }
             // catch exceptions object
             catch (InputMismatchException e){
                 System.out.println("Input was not an Integer. ");
                 kbd=new Scanner(System.in);
             }catch (NumberOutOfRangeException e){
                 System.out.println(e.message);

             }catch (Exception e){
                 System.out.println(e);
                 System.exit(0);
             }
         }while(num>100 || num<0);
    }
}
