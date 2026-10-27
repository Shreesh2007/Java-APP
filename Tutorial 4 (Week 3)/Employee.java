import java.util.Scanner;
public class Employee {
    int employeeId;
    String name;
    double monthlySalary;
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
    double calculateBonus() {
        if (monthlySalary >= 30000) return calculateAnnualSalary() * 0.10;
        else return 0;
    }

    String checkBonusEligibility() {
    return (monthlySalary >= 30000) ? "Eligible" : "Not Eligible";
    }
    void displayDetails() {
        double annualSalary = calculateAnnualSalary();
        double bonus = calculateBonus();
        String eligibility = checkBonusEligibility();
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
        System.out.println("Annual Salary: ₹" + annualSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Bonus Eligibility: " + eligibility);
    }


    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        //Taking the User Inputs
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            employees[i].employeeId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            employees[i].name = sc.nextLine();
            System.out.print("Enter Monthly Salary: ");
            employees[i].monthlySalary = sc.nextDouble();
        }

        System.out.println("\n========== EMPLOYEE DETAILS ==========");
        for (int i = 0; i < 5; i++) employees[i].displayDetails();

        sc.close();
    }
}