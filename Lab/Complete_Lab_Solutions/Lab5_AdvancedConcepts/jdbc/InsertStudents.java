import java.sql.*;

public class InsertStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password"; // change as needed
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Insert records using PreparedStatement
            String insertSQL = "INSERT INTO students (name, marks) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            
            // Insert 5 records
            String[][] students = {
                {"Alice Johnson", "85"},
                {"Bob Smith", "92"},
                {"Carol Davis", "78"},
                {"David Wilson", "95"},
                {"Eva Brown", "88"}
            };
            
            for (String[] student : students) {
                pstmt.setString(1, student[0]);
                pstmt.setInt(2, Integer.parseInt(student[1]));
                pstmt.executeUpdate();
            }
            
            System.out.println("5 records inserted successfully!");
            
            pstmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}