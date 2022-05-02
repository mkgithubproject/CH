import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    private double balance;// instance variable
    // default constructor
    public Account()
    {
        balance = 0;
    }
    Scanner sc=new Scanner(System.in);
    // set initial balance
    public void setInitialBalance(){
        System.out.println();
        System.out.print("Please enter the starting balance: ");
        if(sc.hasNextDouble()){
            balance= sc.nextDouble();
        }else{
            throw new InputMismatchException("Please enter a numeric value.");
        }
    }
    // return current balance
    public double getBalance()
    {
        return balance;
    }
// returns new balance or throw an exception
    public void depositOrWithdraw(double amount)
    {
        if (amount > 0) {
            this.balance=this.balance+amount;
        }else if(amount<0){
            if(Math.abs(amount)>balance){
                throw new IllegalAmountException("Amount entered will cause account to be negative.");
            }else{
                balance=balance+amount;
            }
        }
    }

}
