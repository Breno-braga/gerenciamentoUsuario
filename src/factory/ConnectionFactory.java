package factory;
/**
 * @author Breno
 */

import java.sql.Connection; 

import java.sql.DriverManager; 

import java.sql.SQLException; 

import com.mysql.jdbc.Driver;

public class ConnectionFactory {
    
    public Connection getConnection() {
		 try {
                        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciamentoUsuario","root","ti_2020");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
    
}

