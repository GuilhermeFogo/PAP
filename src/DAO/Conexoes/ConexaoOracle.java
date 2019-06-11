package DAO.Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoOracle implements Conexaobd {

	
	private Connection conn;
	
	public Connection getConn() {
		return conn;
	}

	@Override
	public Connection Conectar() {
		try {
			String usuario = "ALGLE_WEB";
			String pass ="ALGLE_WEB";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            
            this.conn = DriverManager.getConnection(url,usuario,pass);	
            System.out.println("conexao feita");
		} catch (NullPointerException e) {
			throw new NullPointerException("Parametros nulos");
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return this.conn;
	}
	

}
