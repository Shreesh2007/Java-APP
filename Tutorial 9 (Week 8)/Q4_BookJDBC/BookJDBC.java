import java.sql.*;
import java.util.Scanner;

public class BookJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected successfully.");

            System.out.print("Enter Book ID to insert: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            String insert = "INSERT INTO Book(BookID, Title, Author, Price, Availability) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insert)) {
                ps.setInt(1, id);
                ps.setString(2, title);
                ps.setString(3, author);
                ps.setDouble(4, price);
                ps.setBoolean(5, true);
                ps.executeUpdate();
                System.out.println("Book inserted.");
            }

            System.out.print("Enter Book ID to search: ");
            int searchId = sc.nextInt();

            String search = "SELECT * FROM Book WHERE BookID = ?";
            try (PreparedStatement ps = con.prepareStatement(search)) {
                ps.setInt(1, searchId);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        printBook(rs);
                    } else {
                        System.out.println("Book not found.");
                    }
                }
            }

            System.out.println("\nAvailable books:");
            String available = "SELECT * FROM Book WHERE Availability = TRUE";
            try (PreparedStatement ps = con.prepareStatement(available);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    printBook(rs);
                }
            }

            System.out.print("\nEnter Book ID to issue: ");
            int issueId = sc.nextInt();

            String update = "UPDATE Book SET Availability = FALSE WHERE BookID = ?";
            try (PreparedStatement ps = con.prepareStatement(update)) {
                ps.setInt(1, issueId);
                int rows = ps.executeUpdate();
                System.out.println(rows > 0 ? "Book issued successfully." : "Book ID not found.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void printBook(ResultSet rs) throws SQLException {
        System.out.println("ID: " + rs.getInt("BookID")
                + " | Title: " + rs.getString("Title")
                + " | Author: " + rs.getString("Author")
                + " | Price: " + rs.getDouble("Price")
                + " | Available: " + rs.getBoolean("Availability"));
    }
}
