package intermediate.four;

public class BankAccount {
    protected double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        this.balance += balance;
    }
    public void draw(double amount) throws InsufficientFundsException {
       if(amount > this.balance){
           throw new InsufficientFundsException("Not enough money.");
       }
       this.balance -= amount;
    }
}
