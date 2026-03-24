# Bank-Management-Java
To design and implement an Object-Oriented Bank Management System using Java.  The system allows users to perform basic banking operations such as deposit,  withdrawal, and balance enquiry.  This project demonstrates core Object-Oriented Programming concepts such as class,  object, encapsulation, constructor, and method implementation. 
🏦 Bank Management System (Java)
📌 Project Description

This is a simple Bank Management System developed using Java. It allows users to perform basic banking operations such as depositing money, withdrawing money, and checking account balance through a console-based interface.

🚀 Features
✅ Create a bank account with account number and holder name
💰 Deposit money into the account
💸 Withdraw money with balance validation
📊 View account details and current balance
❌ Input validation for invalid transactions
🛠️ Technologies Used
Java (Core Java)
OOP Concepts (Encapsulation, Classes & Objects)
Scanner Class for user input
📂 Project Structure
BankManagement.java
│
├── BankAccount class
│   ├── deposit()
│   ├── withdraw()
│   └── displayBalance()
│
└── BankManagement class (Main Program)
💻 Source Code
import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited : ₹" + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn : ₹" + amount);
        }
    }

    void displayBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount account = new BankAccount(accNo, name);

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using Bank Management System");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}

▶️ How to Run the Program
Save the file as BankManagement.java
Open terminal / command prompt

Compile:

javac BankManagement.java

Run:

java BankManagement
📋 Sample Menu
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
⚠️ Validations Implemented
Deposit amount must be greater than 0
Withdrawal amount must not exceed balance
Error messages for invalid inputs
🎯 Learning Outcomes
Understanding OOP concepts
Working with classes and objects
Handling user input in Java
Implementing basic real-world logic
📌 Future Enhancements
Multiple account support
Database integration
PIN/password security
GUI version (Java Swing/JavaFX)
👩‍💻 Author

Shalini
