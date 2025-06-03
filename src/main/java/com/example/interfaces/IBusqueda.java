package com.example.interfaces;
import java.util.List;
import com.example.modelo.*;

public interface IBusqueda {

    public List <productoCategoria> productoPorCategoria(String categoria);
    public List <productoCategoria> productoPorIDcategoria(int ID);
    public List<productoCategoria> productoPorNombre(String producto);
    public String productoPorIDproducto(int ID);
    public List<productoCategoria> productoPorPrecio(double precio);

}
