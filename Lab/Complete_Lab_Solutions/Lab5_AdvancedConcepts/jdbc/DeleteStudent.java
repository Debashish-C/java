import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password"; // change as needed
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        int studentId = scanner.nextInt();
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            
            // First, check if student exists
            String checkSQL = "SELECT * FROM students WHERE id = ?";
            pstmt = conn.prepareStatement(checkSQL);
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            
            if (!rs.next()) {
                System.out.println("No student found with ID: " + studentId);
                return;
            }
            
            // Delete student
            String deleteSQL = "DELETE FROM students WHERE id = ?";
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1, studentId);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Student with ID " + studentId + " deleted successfully!");
            } else {
                System.out.println("Failed to delete student with ID " + studentId);
            }
            
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred!");
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Message: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in finally block
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}