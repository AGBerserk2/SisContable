package com.example.logicaDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.modelo.Producto;

public class productoDAO {
    public boolean newProducto(Producto producto) {
        String sql = "INSERT INTO producto(nombre, idCategoria,descripcion,precio) VALUES(?,?,?,?)";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCategoriaID());
            ps.setString(3, producto.getNombre());
            ps.setDouble(4, producto.getPrecio());
            return ps.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public boolean deleteProducto(int p) {
        String sql = "DELETE FROM producto WHERE idProducto = ?";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, p);
            return ps.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public boolean updateProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre = ?, IdCategoria = ?, descripcion = ?, precio = ? WHERE idCategoria = ?";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCategoriaID());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getID());

            return ps.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public List<Producto> ListProducto() {
        String sql = "select * from Producto";
        List<Producto> productos = new ArrayList<>();
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                var producto = new Producto(rs.getNString("nombre"),
                                            rs.getDouble("precio"),
                                            rs.getInt("IdCategoria"),
                                            rs.getString("descripcion"));
                productos.add(producto);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return productos;
    }
}