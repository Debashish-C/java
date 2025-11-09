import java.sql.*;

public class JDBCErrorHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nonexistentdb"; // Wrong database
        String username = "wronguser"; // Wrong username
        String password = "wrongpass"; // Wrong password
        
        Connection conn = null;
        
        try {
            // Try to load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully!");
            
            // Try to establish connection
            System.out.println("Attempting to connect to database...");
            conn = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connected to database successfully!");
            
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR: MySQL JDBC Driver not found!");
            System.err.println("Please make sure the MySQL Connector/J is in your classpath.");
            
        } catch (SQLException e) {
            System.err.println("DATABASE CONNECTION ERROR:");
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Message: " + e.getMessage());
            
            // Handle specific error codes
            switch (e.getErrorCode()) {
                case 1045:
                    System.err.println("Authentication failed. Check username and password.");
                    break;
                case 1049:
                    System.err.println("Database does not exist.");
                    break;
                case 0:
                    System.err.println("Connection refused. Check if MySQL server is running.");
                    break;
                default:
                    System.err.println("Unknown database error.");
            }
            
        } finally {
            // Always close connection in finally block
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}