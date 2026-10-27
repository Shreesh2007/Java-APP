import java.util.Scanner;
public class School {
int attendance[] = new int[7];
int present;

public static void main(String[] args) {
    //Creating the Objects
    Scanner sc = new Scanner(System.in);   
    School att = new School(); 
    //Entering the Attendance
    System.out.println("Give the attendance values for 7 days (1 = Present, 0 = Absent)");
    for (int i=0; i<7; i++){
        att.attendance[i] = sc.nextInt();
        if (att.attendance[i] == 1) att.present++;
    }
        //Displaying the Attendance
        System.out.println("Total Present Days : " + att.present);
        if (att.present > 3) System.out.println("Eligible for Exam");
        else System.out.println("Not Eligible for Exam");
    sc.close(); 
}
}

