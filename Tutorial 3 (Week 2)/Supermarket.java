import java.util.Scanner;
public class Supermarket{
    int prices[] = new int[5];
    int total = 0;
    public static void main(String[] args) {
      //Creating the Objects
    Scanner sc = new Scanner(System.in);   
    Supermarket price = new Supermarket();  

      //Entering the Prices
    System.out.println("Enter the price of 5 products: ");
    for (int i=0; i<5; i++){
        price.prices[i] = sc.nextInt();
        price.total+=price.prices[i];
    }
    
    //Displaying the Prices
    System.out.println("Total Bill : " + price.total);
    if (price.total > 5000) System.out.println("Discount Applicable");
    else System.out.println("No Discount");
    
    sc.close();
    }
}