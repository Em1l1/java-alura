package com.alura.jdbc.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {

//	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
//		// TODO
//		ConnectionFactory factory = new ConnectionFactory();
//		Connection con = factory.recuperaConexion();
//
//		Statement statement = con.createStatement();
//
//		statement.execute("UPDATE PRODUCTO SET "
//						+ " NOMBRE = '" + nombre + "'"
//						+ ", DESCRIPCION = '" + descripcion + "'"
//						+ ", CANTIDAD = " + cantidad
//						+ " WHERE ID = " + id);
//
//		int updateCount = statement.getUpdateCount();
//
//		con.close();
//
//		return updateCount;
//	}
//
//	public int eliminar(Integer id) throws SQLException{
//		// TODO
//                Connection con = new ConnectionFactory().recuperaConexion();
//
//                Statement statement = con.createStatement();
//
//                statement.execute("DELETE FROM PRODUCTO WHERE ID = " + id);
//                return statement.getUpdateCount();
//	}
//
//	public List<Map<String, String>> listar() throws SQLException {
//		Connection con = new ConnectionFactory().recuperaConexion();
//
//		// statement
//		Statement statement = con.createStatement();
//		statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
//		ResultSet resultSet = statement.getResultSet();
//
//		// Map
//		List<Map<String, String>> resultado = new ArrayList<>();
//
//		while (resultSet.next()) {
//			Map<String, String> fila = new HashMap<>();
//			fila.put("ID", String.valueOf(resultSet.getInt("ID")));
//			fila.put("NOMBRE", resultSet.getString("NOMBRE"));
//			fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
//			fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));
//
//			resultado.add(fila);
//		}
//
//		con.close();
//		return resultado;
//	}
//

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try(con) {
			final PreparedStatement statement = con
							.prepareStatement("UPDATE PRODUCTO SET "
											+ " NOMBRE = ?, "
											+ " DESCRIPCION = ?,"
											+ " CANTIDAD = ?"
											+ " WHERE ID = ?");
			try(statement) {

				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);
				statement.execute();

				int updateCount = statement.getUpdateCount();

				return updateCount;
			}
		}
	}

	public int eliminar(Integer id) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try(con) {
			final PreparedStatement statement = con
							.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");

			try(statement) {
				statement.setInt(1, id);
				statement.execute();
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
		}
	}

	public List<Map<String, String>> listar() throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try(con) {
			final PreparedStatement statement = con
							.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
			statement.execute();

			try(statement) {

				ResultSet resultSet = statement.getResultSet();

				List<Map<String, String>> resultado = new ArrayList<>();

				while (resultSet.next()) {
					Map<String, String> fila = new HashMap<>();
					fila.put("ID", String.valueOf(resultSet.getInt("ID")));
					fila.put("NOMBRE", resultSet.getString("NOMBRE"));
					fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
					fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));

					resultado.add(fila);
				}
				return resultado;
			}
		}
	}


    public void guardar(Producto producto) throws SQLException {
		// TODO
			String nombre = producto.getNombre();
			String descripcion = producto.getDescripcion();
			Integer cantidad = Integer.valueOf(producto.getCantidad();
			Integer maximoCantidad = 50;

			ConnectionFactory factory = new ConnectionFactory();
//			Connection con = new ConnectionFactory().recuperaConexion();
			final Connection con = factory.recuperaConexion();
			try(con) {
				con.setAutoCommit(false);

				final PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
												+ "(nombre, descripcion, cantidad)"
												+ " VALUE(?, ?, ?)",

								Statement.RETURN_GENERATED_KEYS);
				try(statement) {
					do {
						int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);
						ejecutarRegistro(nombre, descripcion, cantidadParaGuardar, statement);
						cantidad -= maximoCantidad;
					} while (cantidad > 0);

					con.commit();
					System.out.println("Commit");
				} catch (Exception e) {
					con.rollback();
					System.out.println("Rollback");
				}
			}
		}

	private static void ejecutarRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement) throws SQLException {

		if (cantidad < 50) {
			throw new RuntimeException("Ocurrio un error");
		}
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();

		final ResultSet resultSet = statement.getGeneratedKeys();
//		try(ResultSet resultSet = statement.getGeneratedKeys()) {
		try(resultSet) {
			while (resultSet.next()) {
				System.out.println(String.format("Fue insertado el producto de Id %d", resultSet.getInt(1)));
			}
		}
	}

}
