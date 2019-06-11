package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.Conexoes.ConexaoOracle;
import Modal.Calcados;
import Modal.Cliente;
import Modal.Fornecedor;
import Modal.Material;
import Modal.Pedidos;
import Modal.Solicitacao;
import Modal.Usuario;;

public class CRUD_Deletar {
	private Connection conn;
	
	public CRUD_Deletar() {
		this.conn = new ConexaoOracle().Conectar();
	}
	
	public void Deletar(Solicitacao solicitacao) {
		try {
			String sql ="delete from Solicitacao where idSolicitacao=?";
			PreparedStatement prepare = this.conn.prepareStatement(sql);
			prepare.setString(1, solicitacao.getId());
			prepare.execute();
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar(Usuario funcionario) {
		try {
			String sql ="delete from login where idUsuario =?";
			PreparedStatement prepare = this.conn.prepareStatement(sql);
			prepare.setString(1, funcionario.getId());
			prepare.execute();
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar(Cliente ciente){
		try {
			String sql ="delete from Cliente where idCliente=?";
			PreparedStatement prepare = this.conn.prepareStatement(sql);
			prepare.setString(1, ciente.getId() );
			prepare.execute();
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void Deletar(Calcados calcado) {
		try {
			String sql ="delete from produto where idProduto=?";
			PreparedStatement prepare = this.conn.prepareStatement(sql);
			prepare.setString(1, calcado.getId());
			prepare.execute();
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar(Material material) {
		try {
			String sql ="delete from material where idMaterial=?";
			PreparedStatement pre =this.conn.prepareStatement(sql);
			pre.setString(1, material.getId());
			pre.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Exemplo
	public void Deletar(Fornecedor fornecedor) {
		try {
			String sql ="delete from fornecedor where idFornecedor=?";
			PreparedStatement pre =this.conn.prepareStatement(sql);
			pre.setString(1, fornecedor.getId());
			pre.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Deletar(Pedidos pedidos) {
		try {
			String sql ="delete from vendas where idvendas=?";
			PreparedStatement pre =this.conn.prepareStatement(sql);
			pre.setString(1, pedidos.getId());
			pre.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
