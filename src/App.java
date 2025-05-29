
import logicaDAO.CategoriaDAO;
import modelo.Categoria;

public class App {
    public static void main(String[] args) {
        var lista = new CategoriaDAO();
        var cat = new Categoria(1,"MuebleS TUNEADOS");
        System.out.println(lista.updateCategoria(cat));
        for (var elem : lista.ListCategoria()) {

            System.out.println(elem);

        }
    }
}

// string query = "INSERT INTO categoria ( Nombre) VALUES (@Nombre)";
// SqlCommand comando = new SqlCommand(query, conexion);
// comando.Parameters.AddWithValue("@Nombre", Nombre);