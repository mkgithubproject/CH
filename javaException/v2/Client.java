import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        while (true) {
            System.out.println("Press 1. to Deposit, 2. To Withdraw and, 0. to Exit..");
            int choice = sc.nextInt();// select choice
            if(choice==0){
                break;
            }
            switch (choice) {// switch case
                case 1:
                    System.out.print("Enter the amount to deposit ... ");
                    int amt = sc.nextInt();
                    try {
                        // try block , write code may occur exception
                        // if any exception occur.
                        System.out.println(ac.deposit(amt));

                    } catch (IllegalAmountException e) {
                        // catch block handles try block exception.
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw ... ");
                    int amt2 = sc.nextInt();
                    try {
                        // try block , write code may occur exception
                        // if any exception occur.
                        System.out.println(ac.withdraw(amt2));
                    } catch (IllegalAmountException e) {
                        // catch block handles try block exception.
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
