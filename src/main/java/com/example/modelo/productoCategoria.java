package com.example.modelo;

public class productoCategoria {
    private String Nombre;
    private String Categoria;
    private double  precio;

    public productoCategoria(String Categoria, String Nombre, double precio) {
        this.Categoria = Categoria;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public productoCategoria(String Nombre, double precio) {
        this.Nombre = Nombre;
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("productoCategoria{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Categoria=").append(Categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }  
}
