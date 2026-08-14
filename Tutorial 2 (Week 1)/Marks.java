import java.util.Scanner;
public class Marks {
    int subject1;
    int subject2;
    int subject3;

    // Method to calculate and display total and average marks
    void calculateMarks() {
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        // Creating the objects
        Scanner sc = new Scanner(System.in);
        Marks student = new Marks();

        // Taking the User inputs
        System.out.print("Enter marks of Subject 1: ");
        student.subject1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        student.subject2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        student.subject3 = sc.nextInt();

        // Calculating the Total and Average Marks
        student.calculateMarks();
        sc.close();
    }
}