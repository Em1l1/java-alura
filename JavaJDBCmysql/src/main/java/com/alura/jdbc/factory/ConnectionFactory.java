/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author robot
 */
public class ConnectionFactory {
  private DataSource dataSource;
  // ?pool de conexiones
  public ConnectionFactory() {
    var pooledDataSource = new ComboPooledDataSource();
    pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
    pooledDataSource.setUser("root");
    pooledDataSource.setPassword("12345");
    pooledDataSource.setMaxPoolSize(10);

    this.dataSource = pooledDataSource;
  }

  public Connection recuperaConexion() {
    try {
      return this.dataSource.getConnection();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
