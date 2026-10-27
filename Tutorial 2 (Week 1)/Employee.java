public class Employee {
    int empId;
    String name;
    double salary;

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating the objects
        Employee emp1 = new Employee();
        emp1.empId = 101;
        emp1.name = "Rahul";
        emp1.salary = 50000;

        Employee emp2 = new Employee();
        emp2.empId = 102;
        emp2.name = "Ananya";
        emp2.salary = 65000;

        // Displaying employee details
        emp1.display();
        emp2.display();
    }
}