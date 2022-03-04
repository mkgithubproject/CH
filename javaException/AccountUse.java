import java.util.*;

public class AccountUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acoount ac = new Acoount();
        while (true) {
            System.out.println("Press 1. to Deposit, 2. To Withdraw and, 0. to Exit..");
            int choice = sc.nextInt();
            if(choice==0){
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit ... ");
                    int amt = sc.nextInt();
                    try {
                        ac.deposit(amt);
                        System.out.println("Current balance : " + ac.getBalance());
                    } catch (IllegalAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw ... ");
                    int amt2 = sc.nextInt();
                    try {
                        ac.withdraw(amt2);
                        System.out.println("Current balance : " + ac.getBalance());
                    } catch (NotSufficientFundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
