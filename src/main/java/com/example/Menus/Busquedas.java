package com.example.Menus;

import com.example.interfaces.IBusqueda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.example.logicaDAO.Conexion;
import com.example.modelo.*;

public class Busquedas implements IBusqueda {

    @Override
    public List<productoCategoria> productoPorCategoria(String categoria) {
        String sql = "SELECT p.nombre as 'Nombre_Producto', c.nombre as 'Nombre_Categoria', p.precio FROM producto p INNER JOIN categoria c ON p.IdCategoria = c.IdCategoria and c.nombre = ?";
        try {
            List<productoCategoria> list = new ArrayList<>();
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                var producto = new productoCategoria(rs.getNString("Nombre_Producto"), rs.getNString("Nombre_Categoria"),rs.getDouble("precio"));
                list.add(producto);
            }

            return list;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public List<productoCategoria> productoPorIDcategoria(int ID) {
        String sql = "SELECT p.nombre as 'Nombre_Producto', c.nombre as 'Nombre_Categoria', p.precio FROM producto p INNER JOIN categoria c ON p.IdCategoria = c.IdCategoria and c.IdCategoria = ?";
        try {
            List<productoCategoria> lista = new ArrayList<>();
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                var Producto = new productoCategoria(rs.getString("Nombre_Producto"), rs.getString("Nombre_Categoria"),rs.getDouble("precio"));
                lista.add(Producto);
            }

            return lista;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public String productoPorIDproducto(int ID) {
        String sql = "SELECT nombre , precio FROM producto where IdProducto = ? ";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();

            return rs.getString("nombre")+ " " +rs.getDouble("precio");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public List<productoCategoria> productoPorPrecio(double precio) {
        String sql = "SELECT nombre , precio FROM producto where precio = ?";
        List<productoCategoria> prC = new ArrayList<>();
       
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1,precio);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                 var producto = new productoCategoria(rs.getNString("nombre") , rs.getDouble("precio"));
                 prC.add(producto);
            }
            return prC;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public List<productoCategoria> productoPorNombre(String producto) {
        String sql = "SELECT c.nombre AS Categoria, p.nombre , p.precio FROM producto p INNER JOIN categoria c on p.IdProducto = c.IdCategoria and p.nombre = ? ";
       List<productoCategoria> list = new ArrayList<>();
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, producto);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                var pro = new productoCategoria(rs.getNString("Categoria"), rs.getString("nombre"),rs.getDouble("precio"));
                list.add(pro);
            }
            return list;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

}
