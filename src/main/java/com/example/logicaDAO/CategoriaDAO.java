package com.example.logicaDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.modelo.Categoria;

public class CategoriaDAO {

    public boolean newCategoria(Categoria categoria) {
        String sql = "INSERT INTO categoria(nombre) VALUES(?)";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            return ps.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public boolean deleteCategoria(int c) {
        String sql = "DELETE FROM categoria WHERE idCategoria = ?";
        try {
            var conn = Conexion.getConexion(); 
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c);
            return ps.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public boolean updateCategoria(Categoria categoria) {
        String sql = "UPDATE categoria SET nombre =? WHERE idCategoria = ?";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(2, categoria.getID());
            ps.setString(1, categoria.getNombre());

            return ps.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public List<Categoria> ListCategoria() {
        String sql = "select * from categoria";
        List<Categoria> categorias = new ArrayList<>();
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                var categoria = new Categoria(rs.getNString("nombre"));
                categorias.add(categoria);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return categorias;
    }

}