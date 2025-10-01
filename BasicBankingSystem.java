import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    public BankAccount(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false; 
        }
        balance += amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount < 0) {
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return false;
        }
        balance -= amount;
        return true;
    }
    public double getBalance() {
        return balance;
    }
}
public class BasicBankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountHolder = sc.nextLine();
        int accountNumber = sc.nextInt();
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();
        if (accountNumber <= 0 || initialBalance < 0 || depositAmount < 0 || withdrawAmount < 0) {
            System.out.println("Invalid Input values.");
            return;
        }
        BankAccount account = new BankAccount(accountHolder, accountNumber, initialBalance);
        if (!account.deposit(depositAmount)) {
            System.out.println("Invalid Input values.");
            return;
        }
        if (withdrawAmount > account.getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }
        if (!account.withdraw(withdrawAmount)) {
            System.out.println("Invalid Input values.");
            return;
        }
        System.out.println(account.getBalance());
    }
}
