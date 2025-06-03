package com.example.modelo;

import java.util.Objects;

public class Producto {
    private int ID;
    private String nombre;
    private double precio;
    private int categoriaID;
    private String descripcion;

    public Producto(int ID, int categoriaID, String descripcion, String nombre, double precio) {
        this.ID = ID;
        this.categoriaID = categoriaID;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio,int categoriaID,String descripcion) {
        this.categoriaID = categoriaID;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.ID;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 11 * hash + this.categoriaID;
        hash = 11 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.categoriaID != other.categoriaID) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto [");
        sb.append("ID=").append(ID);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", categoriaID=").append(categoriaID);
        sb.append(", descripcion=").append(descripcion);
        sb.append(']');
        return sb.toString();
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public String getDescripcion() {
        return descripcion;
    }
    


}