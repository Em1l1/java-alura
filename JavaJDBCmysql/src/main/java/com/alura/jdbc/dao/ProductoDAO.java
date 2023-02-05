package com.alura.jdbc.dao;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoDAO {
  final private Connection con;

  public ProductoDAO(Connection con) {
    this.con = con;
  }

  public void guardar(Producto producto) {
    try(con) {
      final PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
                      + "(nombre, descripcion, cantidad)"
                      + " VALUE(?, ?, ?)",

              Statement.RETURN_GENERATED_KEYS);
      try(statement) {
        ejecutarRegistro(producto, statement);
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private static void ejecutarRegistro(Producto producto, PreparedStatement statement) throws SQLException {

//		if (cantidad < 50) {
//			throw new RuntimeException("Ocurrio un error");
//		}
    statement.setString(1, producto.getNombre());
    statement.setString(2, producto.getDescripcion());
    statement.setInt(3, producto.getCantidad());

    statement.execute();

    final ResultSet resultSet = statement.getGeneratedKeys();
//		try(ResultSet resultSet = statement.getGeneratedKeys()) {
    try(resultSet) {
      while (resultSet.next()) {
        producto.setId(resultSet.getInt(1));
        System.out.println(String.format("Fue insertado el producto %s", producto));
      }
    }
  }

  public List<Map<String, String>> listar() {
    List<Map<String, String>> resultado = new ArrayList<>();

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
}
