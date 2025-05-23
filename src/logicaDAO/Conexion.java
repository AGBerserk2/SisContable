package logicaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instancia;

    private Conexion() {
    }

    public static Connection getConexion() throws SQLException,ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection( ENV.getDB_URL(),ENV.getDB_USER(),ENV.getDB_PASSWORD());
            return conexion;

    }
}
