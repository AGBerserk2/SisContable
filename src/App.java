import java.sql.Connection;
import java.sql.SQLException;
import logicaDAO.Conexion;
import logicaDAO.productoDAO;

public class App {
    public static void main(String[] args) {
        try (Connection conexion = Conexion.getConexion()) {
            System.out.println("conexion exitosa");
        } catch (SQLException |ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

// string query = "INSERT INTO categoria ( Nombre) VALUES (@Nombre)";
// SqlCommand comando = new SqlCommand(query, conexion);
// comando.Parameters.AddWithValue("@Nombre", Nombre);