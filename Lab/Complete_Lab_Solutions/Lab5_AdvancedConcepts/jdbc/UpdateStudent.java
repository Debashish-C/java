import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password"; // change as needed
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Update student record
            String updateSQL = "UPDATE students SET name = ?, marks = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateSQL);
            
            pstmt.setString(1, "Robert Smith"); // New name
            pstmt.setInt(2, 98); // New marks
            pstmt.setInt(3, 2); // Student ID to update
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Student record updated successfully!");
            } else {
                System.out.println("No student found with the given ID!");
            }
            
            pstmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}