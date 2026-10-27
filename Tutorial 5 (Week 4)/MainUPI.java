import java.util.Scanner;
interface Payment {
    void makePayment(double amount);
}

class UPI implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made through UPI.");
    }
}

class CreditCard implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made through Credit Card.");
    }
}

class NetBanking implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made through Net Banking.");
    }
}

public class MainUPI {
    public static void main(String[] args) {
        //Creating the Objects
        Scanner sc = new Scanner(System.in);

        //Entering the User Inputs
        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        //Entering the payment type
        Payment payment;
        switch (choice) {
            case 1:
                payment = new UPI();
                break;
            case 2:
                payment = new CreditCard();
                break;
            case 3:
                payment = new NetBanking();
                break;
            default:
                System.out.println("Invalid payment method.");
                sc.close();
                return;
        }
        payment.makePayment(amount);
        sc.close();
    }
}