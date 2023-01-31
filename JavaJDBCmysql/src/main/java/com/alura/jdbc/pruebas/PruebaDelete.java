package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author robot
 */
public class PruebaDelete {
    public static void main(String[] args) throws SQLException {
  
        // TODO
        Connection con = new ConnectionFactory().recuperaConexion();

        Statement statement = con.createStatement();

        statement.execute("DELETE FROM PRODUCTO WHERE ID = " + 99);
        System.out.println(statement.getUpdateCount());
	
    }
    
}
