class Employee {
    String name;
    int employeeId;
    double basicSalary;

    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}

class Professor extends Employee {
    Professor(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }
    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.30);
    }
}

class LabAssistant extends Employee {
    LabAssistant(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }
    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.15);
    }
}

class AdministrativeStaff extends Employee {
    AdministrativeStaff(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }
    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.10);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee professor = new Professor("Rahul", 101, 50000);
        Employee labAssistant = new LabAssistant("Ananya", 102, 40000);
        Employee admin = new AdministrativeStaff("Ravi", 103, 35000);
        professor.display();
        labAssistant.display();
        admin.display();
    }
}