package com.alura.jdbc.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<Map<String, String>> listar() throws SQLException {
		Connection con = new ConnectionFactory().recuperaConexion();

		// statement
		Statement statement = con.createStatement();
		statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
		ResultSet resultSet = statement.getResultSet();

		// Map
		List<Map<String, String>> resultado = new ArrayList<>();

		while (resultSet.next()) {
			Map<String, String> fila = new HashMap<>();
			fila.put("ID", String.valueOf(resultSet.getInt("ID")));
			fila.put("NOMBRE", resultSet.getString("NOMBRE"));
			fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
			fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));

			resultado.add(fila);
		}

		con.close();
		return resultado;
	}

    public void guardar(Map<String, String> producto) throws SQLException {
		// TODO
            Connection con = new ConnectionFactory().recuperaConexion();
            Statement statement = con.createStatement();
            
            statement.execute("INSERT INTO PRODUCTO(nombre, descripcion, cantidad)"
                                + " VALUE('" + producto.get("NOMBRE") + "', '"
                                + producto.get("DESCRIPCION") + "', "
                                + producto.get("CANTIDAD") + ")", statement.RETURN_GENERATED_KEYS);
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            while (resultSet.next()) {
                System.out.println(String.format("Fue insertado el producto de Id %d", resultSet.getInt(1)));
            }
            

	}
 
}
