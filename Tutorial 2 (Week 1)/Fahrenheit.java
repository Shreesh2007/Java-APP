import java.util.Scanner;
public class Fahrenheit {
    double celsius;
    
    void convertTemperature() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
    }

    public static void main(String[] args) {
        // Creating the objects
        Scanner sc = new Scanner(System.in);
        Fahrenheit temp = new Fahrenheit();

        // Taking the User input
        System.out.print("Enter temperature in Celsius: ");
        temp.celsius = sc.nextDouble();

        // Converting Celsius to Fahrenheit
        temp.convertTemperature();
        sc.close();
    }
}