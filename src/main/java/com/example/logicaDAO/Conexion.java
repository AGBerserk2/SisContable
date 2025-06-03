package com.example.logicaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conexion;

    private Conexion() {
    }

    public static Connection getConexion() throws SQLException, ClassNotFoundException {
        if (conexion == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(ENV.getDB_URL(), ENV.getDB_USER(), ENV.getDB_PASSWORD());
        }
        return conexion;

    }
}
