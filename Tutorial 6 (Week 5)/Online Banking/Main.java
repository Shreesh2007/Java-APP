import accounts.*;
import payments.*;
import transactions.OnlineTransaction;

public class Main {
    public static void main(String[] args) {
        Account a;
        a = new SavingsAccount(101, "Rahul", 50000, 4.0);
        a.displayDetails();
        System.out.println();
        a = new CurrentAccount(102, "Aman", 75000, 10000);
        a.displayDetails();
        System.out.println();

        Payment p;
        p = new UPIPayment();
        p.pay(2500);
        System.out.println();
        p = new CardPayment();
        p.pay(5000);
        System.out.println();

        UPIPayment upi = new UPIPayment();
        upi.pay(3000);
        upi.verifyPayment();
        System.out.println();

        if (upi instanceof OnlineTransaction) System.out.println("UPI is an online transaction.");
        CardPayment card = new CardPayment();
        if (card instanceof OnlineTransaction) System.out.println("Card payment is an online transaction.");
    }
}