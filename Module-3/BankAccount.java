public class BankAccount {

    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Main method
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(2000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Final Balance: " + acc.getBalance());
    }
}