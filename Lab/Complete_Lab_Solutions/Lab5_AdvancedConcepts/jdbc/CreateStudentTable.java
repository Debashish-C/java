import java.sql.*;

public class CreateStudentTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password"; // change as needed
        
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Create statement
            Statement stmt = conn.createStatement();
            
            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                                   "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                   "name VARCHAR(100) NOT NULL, " +
                                   "marks INT NOT NULL)";
            
            stmt.executeUpdate(createTableSQL);
            System.out.println("Students table created successfully!");
            
            // Close resources
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred!");
            e.printStackTrace();
        }
    }
}