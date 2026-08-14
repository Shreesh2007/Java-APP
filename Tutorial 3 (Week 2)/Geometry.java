import java.util.Scanner;
public class Geometry {
    // Method to calculate area of square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Method to calculate area of rectangle
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate area of circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Geometry obj = new Geometry();

        // Taking User Inputs
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // Calling overloaded methods
        obj.calculateArea(side);
        obj.calculateArea(length, breadth);
        obj.calculateArea(radius);
        sc.close();
    }
}