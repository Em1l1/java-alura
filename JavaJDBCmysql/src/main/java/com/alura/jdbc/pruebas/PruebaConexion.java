package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;
import java.sql.SQLException;
import java.sql.Connection;


public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().recuperaConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }
}
