public class Acoount {
    private double balance;
    public void withdraw(int amount) throws NotSufficientFundException {
        if (amount > this.balance) {
            throw new NotSufficientFundException();
        }
        this.balance = this.balance - amount;
    }
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalAmountException();
        }
        this.balance=this.balance+amount;
    }
    public double getBalance(){
        return this.balance;
    }
}
