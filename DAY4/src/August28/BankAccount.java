//2.	Bank Account Management
//Create a class BankAccount with attributes accountNumber, 
//holderName, balance. Use a constructor to initialize values. 
//Add methods for deposit, withdraw, and check balance.

package August28;
import java.util.*;

public class BankAccount {
    int accNum;
    String holderName;
    double balance;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public BankAccount(int accNum, String holderName, double balance) {
        this.accNum = accNum;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Cross-check account details
    private boolean validateUser() {
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        return this.accNum == acc && this.holderName.equalsIgnoreCase(name);
    }

    // Deposit
    public void deposit() {
        System.out.println("\n---- Deposit Section ----");
        if (validateUser()) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            if (amount > 0) {
                balance += amount;
                System.out.println("₹" + amount + " deposited successfully.");
            } else {
                System.out.println("Invalid amount!");
            }
        } else {
            System.out.println("Invalid user details!");
        }
    }

    // Withdraw
    public void withdraw() {
        System.out.println("\n---- Withdraw Section ----");
        if (validateUser()) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance or invalid amount!");
            }
        } else {
            System.out.println("Invalid user details!");
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("\n---- Balance Section ----");
        if (validateUser()) {
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid user details!");
        }
    }

    // Main method with Menu
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(101, "Akash", 5000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> bank.deposit();
                case 2 -> bank.withdraw();
                case 3 -> bank.checkBalance();
                case 4 -> {
                    System.out.println("Thank you for using our banking system!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
