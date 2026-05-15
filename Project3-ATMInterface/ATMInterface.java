import java.util.ArrayList;
import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
        transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: ₹" + initialBalance);
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Check Balance Method
    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    // Transaction History Method
    public void showTransactionHistory() {
        System.out.println("\n=== Transaction History ===");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

// ATM Class
class ATM {
    private BankAccount account;
    private final int correctPin = 1234;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Start ATM System
    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to ATM Interface ===");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        // PIN Validation
        if (enteredPin != correctPin) {
            System.out.println("Incorrect PIN. Access denied.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.showTransactionHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

// Main Class
public class ATMInterface {
    public static void main(String[] args) {

        // Create Bank Account with initial balance
        BankAccount userAccount = new BankAccount(5000);

        // Create ATM object
        ATM atm = new ATM(userAccount);

        // Start ATM system
        atm.start();
    }
}