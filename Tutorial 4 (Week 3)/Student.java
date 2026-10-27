import java.util.Scanner;
public class Student {
    int rollNumber;
    String studentName;
    int[] marks = new int[3];
    double attendance;

    void displayPerformance() {
        int total = 0;
        for (int i = 0; i < 3; i++) total += marks[i];
        double average = total / 3.0;
        String result = (average >= 50) ? "Pass" : "Fail";
        String scholarship = (average >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String performance = (average >= 85) ? "Excellent" : "Good";

        System.out.println("\nRoll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // Taking the User Inputs
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter Roll Number: ");
            students[i].rollNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            students[i].studentName = sc.nextLine();
            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }
            System.out.print("Enter Attendance Percentage: ");
            students[i].attendance = sc.nextDouble();
        }

        System.out.println("\n========== STUDENT PERFORMANCE ==========");
        for (int i = 0; i < 5; i++) students[i].displayPerformance();

        double highestAverage = 0;
        int highestStudent = 0;
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) total += students[i].marks[j];
            double average = total / 3.0;
            if (average > highestAverage) {
                highestAverage = average;
                highestStudent = i;
            }
        }

        System.out.println("\n========== TOP PERFORMER ==========");
        System.out.println("Roll Number: " + students[highestStudent].rollNumber);
        System.out.println("Student Name: " + students[highestStudent].studentName);
        System.out.println("Highest Average: " + highestAverage);
        sc.close();
    }
}