public class Account {
    private double balance;// instance variable
    // default constructor
    public Account()
    {
        balance = 0;
    }
    // parameterized constructor
    public Account(double initialDeposit)
    {
        balance = initialDeposit;
    }
    // return current balance
    public double getBalance()
    {
        return balance;
    }
// returns new balance or throw an exception
    public double deposit(double amount)
    {    // if amount is less than or equal to zero return exception (throw IllegalAmountException class object)
        if (amount <= 0) {
            throw new IllegalAmountException("Deposit amount should be greater than zero.");
        }
        // else update new balance and return it.
        this.balance=this.balance+amount;
        return balance;
    }

    // returns new balance or -1 if invalid amount
    public double withdraw(double amount)
    {    // throw an exception
        if (amount > this.balance || amount<=0) {
            throw new IllegalAmountException("Withdraw amount should be greater than zero and less than or equal to your account balance");
        }
        // else update new balance and return it.
        this.balance = this.balance - amount;
        return balance;
    }
}
