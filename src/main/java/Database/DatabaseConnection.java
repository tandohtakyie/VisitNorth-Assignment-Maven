package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	// database username
    private static String databaseUsername = "root";
    
    // database password
    private static String databasePassword = "admin";
    
    // database name
    private static String databaseName = "visitnorth";

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, databaseUsername, databasePassword);
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
