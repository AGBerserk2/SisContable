package Menus;

import interfaces.IBusqueda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logicaDAO.Conexion;

public class Busquedas implements IBusqueda {

    @Override
    public String productoPorCategoria(String categoria) {
        String sql = "";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return null;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public String productoPorIDcategoria(int ID) {
        String sql = "";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return null;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public String productoPorIDproducto(String ID) {
        String sql = "";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return null;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public String productoPorPrecio(double precio) {
        String sql = "";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return null;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    @Override
    public String productoPorNombre(String producto) {
        String sql = "";
        try {
            var conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return null;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

}
