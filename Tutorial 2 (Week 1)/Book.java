import java.util.Scanner;
public class Book{
    int price;
    String title;
    String author;

    public static void main(String[] args) {
    //Creating the Objects
    Scanner sc = new Scanner(System.in);   
    Book book = new Book();
    
    //Taking the User Inputs
    System.out.println("Enter Book Title: ");
    book.title = sc.nextLine();
    System.out.println("Enter The Author: ");
    book.author = sc.nextLine();
    System.out.println("Enter The Price: ");
    book.price = sc.nextInt();
    sc.nextLine();

    //Displaying the Student Details
    System.out.println("The Book name is: " + book.title);
    System.out.println("The Price of the Book is: " + book.price);
    System.out.println("The Author of the Book is: " + book.author);

    sc.close();
    }
}
