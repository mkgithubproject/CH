import java.util.*;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        System.out.println("Your Name-Week 4 PA Account Balance Calculations");
        try{
            ac.setInitialBalance();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        while (true) {
            System.out.print("Please enter a credit or debit amount (0 to quit): ");
            try {
                Double inputValue=sc.nextDouble();
                if(inputValue==0){
                    System.out.println("The updated balance is: "+String.format("%.2f",ac.getBalance()));
                    break;
                }
                ac.depositOrWithdraw(inputValue);
                System.out.println("The updated balance is: "+String.format("%.2f",ac.getBalance()));
            }catch(IllegalAmountException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Please enter a numeric value.");
                sc.nextLine();
            }
            }// end loop
        }
    }
