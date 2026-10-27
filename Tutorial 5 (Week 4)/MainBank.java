import java.util.Scanner;
class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class MainBank {
    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);

        //Entering the User Inputs
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        //Running the Constructor and Entering the User Inputs
        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
    
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        
        System.out.println("\nUpdated Account Details:");
        account.display();
        sc.close();
    }
}