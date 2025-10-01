import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount = scanner.nextDouble();
        if (accountNumber <= 0 || initialBalance < 0 || depositAmount < 0 || withdrawAmount < 0) {
            System.out.println("Invalid input values");
            scanner.close();
            return;
        }
        double currentBalance = initialBalance + depositAmount;
        if (withdrawAmount > currentBalance) {
            System.out.println("Insufficient balance");
        } else {
            currentBalance -= withdrawAmount;
            System.out.println(currentBalance);
        }
        scanner.close();
    }
}