import java.util.Scanner;
public class Employee {
    int employeeId;
    String employeeName;
    double salary;

    // Constructor to initialize employee details
    Employee(int id, String name, double sal) {
        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);

        // Taking User Inputs
        System.out.print("Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Salary : ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        // Displaying Employee Details
        System.out.println("Employee ID : " + emp.employeeId);
        System.out.println("Employee Name : " + emp.employeeName);
        System.out.println("Salary : " + emp.salary);

        sc.close();
    }
}