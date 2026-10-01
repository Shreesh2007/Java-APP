package accounts;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String name,
                          double balance, double interestRate) {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}