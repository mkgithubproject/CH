 class U9E02R
{
    private double balance;


    public U9E02R()
    {
        balance = 0;
    }

    public U9E02R(double bal )
    {
        balance = bal;
    }


    public void deposit(double amount)
    {
        balance = balance + amount;
    }


    public void withdraw(double amount)
    {
        balance = balance - amount;
    }


    public double getBalance()
    {
        return balance;
    }
}


// BasicAccount
class BasicAccount  extends U9E02R{

    // default constructor
    public BasicAccount()
    {

    }

    public BasicAccount(double bal)
    {
        super(bal);
    }



    public void withdraw(double amount){

        int overDraftFee = 30;

        double balance = super.getBalance();


        if (amount > balance)
        {
            System.out.println("Not enough money in your account . An overdraft fee of $30 has been added.");
            super.withdraw(amount + overDraftFee);
        }
        else
            super.withdraw(amount);

    }


    public void testWithdraw()
    {

        U9E02R TestAccount = new BasicAccount (100.00);


        TestAccount.withdraw (90);


        System.out.println("balance "+ TestAccount.getBalance());

        TestAccount.withdraw (90);

        System.out.println("balance "+TestAccount.getBalance());



    }

}
public class U9E02D {
    public static void main(String[] args){
        new BasicAccount().testWithdraw();
    }
}
