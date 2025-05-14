package logicaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection() throws SQLException {
         Connection conexion = DriverManager.getConnection(System.getenv("DB_NAME"),
          System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));
        return conexion;
    }

}
