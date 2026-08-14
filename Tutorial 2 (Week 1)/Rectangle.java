import java.util.Scanner;
public class Rectangle {
    int length;
    int breadth;

    void calculateArea() {
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        // Creating the objects
        Scanner sc = new Scanner(System.in);
        Rectangle room = new Rectangle();

        // Taking the User inputs
        System.out.print("Enter length of the room: ");
        room.length = sc.nextInt();
        System.out.print("Enter breadth of the room: ");
        room.breadth = sc.nextInt();

        // Calculating the Area
        room.calculateArea();
        sc.close();
    }
}