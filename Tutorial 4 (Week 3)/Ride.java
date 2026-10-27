import java.util.Scanner;
public class Ride {
    int rideNumber;
    String rideName;
    Ride(int number, String name) {
        rideNumber = number;
        rideName = name;
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Ride[] rides = new Ride[5];

        // Taking the User Inputs
        for (int i = 0; i < 5; i++) {
            System.out.println("\nRide " + (i + 1) + ":");
            System.out.print("Enter Ride Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Ride Name: ");
            String name = sc.nextLine();
            rides[i] = new Ride(number, name);
        }

        System.out.println("\n========== RIDE ACTIVITY ==========");
        for (int i = 0; i < 5; i++) {
            System.out.print(rides[i].rideName + " : ");
            for (int j = 0; j < rides[i].rideNumber; j++) System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}