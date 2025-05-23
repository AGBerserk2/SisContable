package modelo;
public class Inventario {
    private int ID;
    private int productoID;
    private int cantidad;

    public Inventario(int iD, int productoID, int cantidad) {
        ID = iD;
        this.productoID = productoID;
        this.cantidad = cantidad;
    }

}