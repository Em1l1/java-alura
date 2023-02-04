package com.alura.jdbc.dao;

import com.alura.jdbc.modelo.Producto;

import java.sql.*;

public class ProductoDAO {
  final private Connection con;

  public ProductoDAO(Connection con) {
    this.con = con;
  }

  public void guardar(Producto producto) throws SQLException {
// TODO
//    String nombre = producto.getNombre();
//    String descripcion = producto.getDescripcion();
//    Integer cantidad = producto.getCantidad();

    try(con) {
      con.setAutoCommit(false);

      final PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
                      + "(nombre, descripcion, cantidad)"
                      + " VALUE(?, ?, ?)",

              Statement.RETURN_GENERATED_KEYS);
      try(statement) {
        ejecutarRegistro(producto, statement);
        con.commit();
        System.out.println("Commit");
      } catch (Exception e) {
        con.rollback();
        System.out.println("Rollback");
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

}
