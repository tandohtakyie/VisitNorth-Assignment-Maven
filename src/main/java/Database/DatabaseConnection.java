package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String databaseUsername = "root";
    // gabriel password
    private static String databasePassword = "admin";
    // jack password
   // private static String databasePassword = "GoodGameMySQL2798";
    private static String databaseName = "visitnorth";

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // gabriel connect
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, databaseUsername, databasePassword);
            // jack connect
           // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/"+ databaseName +"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", databaseUsername, databasePassword);
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
