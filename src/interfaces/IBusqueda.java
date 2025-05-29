package interfaces;

public interface IBusqueda {

    public String productoPorCategoria(String categoria);
    public String productoPorIDcategoria(int ID);
    public String productoPorNombre(String producto);
    public String productoPorIDproducto(String ID);
    public String productoPorPrecio(double precio);

}
