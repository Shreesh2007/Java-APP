import java.util.Scanner;
public class Student1{
    int rollnumber;
    String name;
    void display(){
    System.out.println("The Student name is: " + name);
    System.out.println("The Student roll number is: " + rollnumber);
    }
    public static void main(String[] args) {
    //Creating the Objects
    Scanner sc = new Scanner(System.in);   
    Student1 stu = new Student1();
    
    //Taking the User Inputs
    System.out.println("Enter your name: ");
    stu.name = sc.nextLine();
    System.out.println("Enter your roll number: ");
    stu.rollnumber = sc.nextInt();
    sc.nextLine();

    //Displaying the Student Details
    stu.display();
    sc.close();
    }
}
