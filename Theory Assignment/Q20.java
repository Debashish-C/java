import java.sql.*;
import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter username: ");
            String uname = sc.next();
            System.out.print("Enter password: ");
            String pwd = sc.next();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            ps.setString(1, uname);
            ps.setString(2, pwd);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("✅ Login successful! Welcome, " + uname);
            } else {
                System.out.println("❌ Invalid username or password.");
            }

        } catch (SQLSyntaxErrorException e) {
            System.out.println("Database error: Check your table or query syntax.");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
