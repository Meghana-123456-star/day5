class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class Bankaccount {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(10000);
        account.withdraw(2500);

        System.out.println("Balance: " + account.getBalance());
    }
}