package com.example.Menus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.interfaces.IInventario;
import com.example.logicaDAO.Conexion;

public class Inventario implements IInventario {

    @Override
    public int totalDineroEnInventario() {
        String sql = "SELECT COUNT(precio) FROM producto";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return rs.getInt(1);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return 0;
        }

    }

    @Override
    public int totalDineroEnInventarioPorCategoria(int IdCategoria) {
        String sql = "SELECT COUNT(precio) FROM producto where IdCategoria = ?";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, IdCategoria);
            ResultSet rs = ps.executeQuery();

            return rs.getInt(1);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return 0;
        }
    }

    @Override
    public int totalProductos() {
        String sql = "SELECT COUNT(*) FROM producto";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return rs.getInt(1);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return 0;
        }

    }

    @Override
    public int totalProductosPorCategoria(int IdCategoria) {
        String sql = "SELECT COUNT(*) FROM producto where IdCategoria = ?";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, IdCategoria);
            ResultSet rs = ps.executeQuery();
            return rs.getInt(1);
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return 0;
        }

    }

}
