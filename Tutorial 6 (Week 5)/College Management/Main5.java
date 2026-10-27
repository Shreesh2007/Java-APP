import student.Student;
import course.Course;

public class Main5 {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 101, 20);
        Course c = new Course("Java Programming", "CS101", 4);
        s.displayDetails();
        System.out.println();
        c.displayDetails();
    }
}