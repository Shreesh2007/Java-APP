import java.util.Scanner;
public class Product {
    int productId, quantity;
    String productName;
    double price;

    void displayBill() {
        double totalPrice = price * quantity;
        double discount;
        if (totalPrice >= 5000) discount = totalPrice * 0.10;
        else discount = totalPrice * 0.05;
        double finalPrice = totalPrice - discount;

        System.out.println("\nProduct ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Taking the User Inputs
        for (int i = 0; i < 5; i++) {
            products[i] = new Product();
            System.out.println("\nProduct " + (i + 1) + ":");
            System.out.print("ID: ");
            products[i].productId = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            products[i].productName = sc.nextLine();
            System.out.print("Price: ");
            products[i].price = sc.nextDouble();
            System.out.print("Quantity: ");
            products[i].quantity = sc.nextInt();
        }

        System.out.println("\n========== PRODUCT BILL ==========");
        for (int i = 0; i < 5; i++) products[i].displayBill();
        sc.close();
    }
}