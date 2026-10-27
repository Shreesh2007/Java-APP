import java.sql.*;
import java.util.Scanner;

public class CourseRegistrationJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected successfully.");

            System.out.print("Enter Course Code: ");
            String courseCode = sc.nextLine();

            String sql = "SELECT StudentID, StudentName, CourseCode, CourseName, Semester "
                       + "FROM CourseRegistration WHERE CourseCode = ?";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, courseCode);

                try (ResultSet rs = ps.executeQuery()) {
                    boolean found = false;

                    while (rs.next()) {
                        found = true;
                        System.out.println(
                            "Student ID: " + rs.getInt("StudentID")
                            + " | Student Name: " + rs.getString("StudentName")
                            + " | Course Code: " + rs.getString("CourseCode")
                            + " | Course Name: " + rs.getString("CourseName")
                            + " | Semester: " + rs.getInt("Semester")
                        );
                    }

                    if (!found) {
                        System.out.println(
                            "No students are registered for course code: " + courseCode);
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
