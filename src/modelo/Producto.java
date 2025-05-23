package modelo;
public class Producto{
    private int ID;
    private String nombre;
    private double precio;
    private int categoriaID;
    public Producto(int iD, String nombre, double precio, int categoriaID) {
        ID = iD;
        this.nombre = nombre;
        this.precio = precio;
        this.categoriaID = categoriaID;
    }
    
}