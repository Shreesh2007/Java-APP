import java.sql.*;
import java.util.Scanner;

public class ProductJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/store";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected successfully.");

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            String insert = "INSERT INTO Product(ProductID, ProductName, Price, Quantity) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insert)) {
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setDouble(3, price);
                ps.setInt(4, quantity);
                ps.executeUpdate();
                System.out.println("Product inserted.");
            }

            System.out.print("Enter Product ID to retrieve: ");
            int searchId = sc.nextInt();

            String select = "SELECT * FROM Product WHERE ProductID = ?";
            try (PreparedStatement ps = con.prepareStatement(select)) {
                ps.setInt(1, searchId);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        printProduct(rs);
                    } else {
                        System.out.println("Product not found.");
                    }
                }
            }

            System.out.print("Enter Product ID to update quantity: ");
            int updateId = sc.nextInt();
            System.out.print("Enter new quantity: ");
            int newQuantity = sc.nextInt();

            String update = "UPDATE Product SET Quantity = ? WHERE ProductID = ?";
            try (PreparedStatement ps = con.prepareStatement(update)) {
                ps.setInt(1, newQuantity);
                ps.setInt(2, updateId);
                int rows = ps.executeUpdate();
                System.out.println(rows > 0 ? "Quantity updated." : "Product ID not found.");
            }

            System.out.println("\nProducts with quantity below 10:");
            String lowStock = "SELECT * FROM Product WHERE Quantity < 10";
            try (PreparedStatement ps = con.prepareStatement(lowStock);
                 ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    found = true;
                    printProduct(rs);
                }
                if (!found) {
                    System.out.println("No low-stock products.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void printProduct(ResultSet rs) throws SQLException {
        System.out.println("ID: " + rs.getInt("ProductID")
                + " | Name: " + rs.getString("ProductName")
                + " | Price: " + rs.getDouble("Price")
                + " | Quantity: " + rs.getInt("Quantity"));
    }
}
