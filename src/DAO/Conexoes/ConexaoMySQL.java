package DAO.Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL implements Conexaobd {
	private Connection conn;
	
	public Connection getConn() {
		return conn;
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public Connection Conectar() {
		try {
			String usuario ="root";
			String senha ="123456";
			String ip ="localhost";
			String banco="teste_db";
			String jdbc ="jdbc:mysql://"+ ip+"/"+banco;
			Class.forName("com.mysql.jdbc.Driver");
			
			this.conn = (DriverManager.getConnection(jdbc, usuario, senha));
		}catch (NullPointerException e) {
			throw new NullPointerException("Parametros nulos");
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			return this.conn;
		}
	}
}
