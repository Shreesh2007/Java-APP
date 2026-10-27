package payments;

import transactions.OnlineTransaction;

public class CardPayment implements Payment, OnlineTransaction {
    @Override public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}