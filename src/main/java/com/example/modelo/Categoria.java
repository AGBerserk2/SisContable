package com.example.modelo;

import java.util.Objects;

public class Categoria {
    private int ID;
    private String nombre;

    public Categoria(int iD, String nombre) {
        this.ID = iD;
        this.nombre = nombre;
    }

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ID;
        hash = 79 * hash + Objects.hashCode(this.nombre);
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
        final Categoria other = (Categoria) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Categoria[");
        sb.append("ID=").append(ID);
        sb.append(", nombre=").append(nombre);
        sb.append(']');
        return sb.toString();
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

}