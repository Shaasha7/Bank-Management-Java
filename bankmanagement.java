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