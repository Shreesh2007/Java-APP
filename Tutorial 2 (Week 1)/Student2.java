public class Student2 {
    String name;
    int age;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // Creating the objects
        Student2 student1 = new Student2();
        student1.name = "Rahul";
        student1.age = 20;

        Student2 student2 = new Student2();
        student2.name = "Ananya";
        student2.age = 19;

        // Displaying details
        student1.display();
        student2.display();
    }
}