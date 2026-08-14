import java.util.Scanner;
public class Student{
    int rollnumber;
    String department;
    String name;

    public static void main(String[] args) {
    //Creating the Objects
    Scanner sc = new Scanner(System.in);   
    Student stu = new Student();
    
    //Taking the User Inputs
    System.out.println("Enter your name: ");
    stu.name = sc.nextLine();
    System.out.println("Enter your department: ");
    stu.department = sc.nextLine();
    System.out.println("Enter your roll number: ");
    stu.rollnumber = sc.nextInt();
    sc.nextLine();

    //Displaying the Student Details
    System.out.println("The Student name is: " + stu.name);
    System.out.println("The Student roll number is: " + stu.rollnumber);
    System.out.println("The Student department is: " + stu.department);

    sc.close();
    }
}
