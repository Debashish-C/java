import java.sql.*;
import java.util.*;

public class StudentResultJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             Scanner sc = new Scanner(System.in)) {

            // Create table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS results (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "marks INT, " +
                    "grade CHAR(2))");

            // Insert data
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 50) ? "C" : "F";
            PreparedStatement ps = con.prepareStatement("INSERT INTO results(name, marks, grade) VALUES(?, ?, ?)");
            ps.setString(1, name);
            ps.setInt(2, marks);
            ps.setString(3, grade);
            ps.executeUpdate();

            System.out.println("✅ Record inserted successfully.");

            // Top 3 students
            ResultSet rs = st.executeQuery("SELECT * FROM results ORDER BY marks DESC LIMIT 3");
            System.out.println("\n🏆 Top 3 Students:");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getInt("marks") + " (" + rs.getString("grade") + ")");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
