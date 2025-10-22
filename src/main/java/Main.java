import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // This is just to test copilot working as exoected
        String userInput = args.length > 0 ? args[0] : "admin";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password123");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                System.out.println("User: " + rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}