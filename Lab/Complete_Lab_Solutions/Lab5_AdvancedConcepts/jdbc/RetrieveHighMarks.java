import java.sql.*;

public class RetrieveHighMarks {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password"; // change as needed
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            
            String selectSQL = "SELECT * FROM students WHERE marks > 80";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);
            
            System.out.println("Students with marks > 80:");
            System.out.println("ID\tName\t\tMarks");
            System.out.println("--------------------------------");
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                
                System.out.println(id + "\t" + name + "\t" + marks);
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}