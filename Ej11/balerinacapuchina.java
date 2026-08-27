import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class balerinacapuchina {

    private static String url = "jdbc:mysql://localhost:3306/ej11";
    private static String user = "root";
    private static String password = "usbw";

    public static Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el driver de MySQL: " + e.getMessage());
        }
        return DriverManager.getConnection(url, user, password);
    }
}