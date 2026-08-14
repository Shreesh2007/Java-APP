import java.util.Scanner;
public class Patient {
    String patientName;
    double consultationFee;
    Patient(String name, double fee) {
        patientName = name;
        consultationFee = fee;
    }
    double calculateFinalAmount(double discountRate) {
        double discount = consultationFee * discountRate;
        return consultationFee - discount;
    }
    void displayDetails(double discountRate) {
        double discount = consultationFee * discountRate;
        double finalAmount = calculateFinalAmount(discountRate);
        System.out.println("\nPatient Name: " + patientName);
        System.out.println("Original Consultation Fee: ₹" + consultationFee);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        // Taking the User Inputs
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPatient " + (i + 1) + ":");
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();
            patients[i] = new Patient(name, fee);
        }

        System.out.println("\n========== CONSULTATION BILL ==========");
        for (int i = 0; i < 5; i++) {
            double discountRate;
            if (patients[i].consultationFee >= 2000) discountRate = 0.10;
            else discountRate = 0.05;
            patients[i].displayDetails(discountRate);
        }
        sc.close();
    }
}