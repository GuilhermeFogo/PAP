package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import DAO.Conexoes.ConexaoOracle;
import Modal.Calcados;
import Modal.Cliente;
import Modal.Fornecedor;
import Modal.Material;
import Modal.Pedidos;
import Modal.Usuario;;

public class CRUD_Visualizar {
	private Connection conn;
	public CRUD_Visualizar() {
		this.conn = new ConexaoOracle().Conectar();		
	}
	
	@SuppressWarnings("finally")
	public List<Usuario> VerUsuarios() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			String sql = "select * from Usuario";
			PreparedStatement statement =this.conn.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			while (resultado.next()) {
				Usuario usu = new Usuario();
				usu.setNome(resultado.getString("nome"));
				usu.setSenha(resultado.getString("senha"));
				usu.setPerfil(resultado.getString("perfil"));
				lista.add(usu);
			}
			
			resultado.close();
			statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			
			return lista;
		}
	}
	
	public Usuario BuscaLogin() {
		Usuario usu = new Usuario();
		try {
			String sql ="select * from Usuario";
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
				usu.setNome(result.getString("nome"));
				usu.setSenha(result.getString("senha"));
				usu.setPerfil(result.getString("perfil"));
			}
			result.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usu;
	}
	
	
	
	public List<Cliente> BuscarClientes() {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			String sql ="select * from clientee";
			Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(result.getString("nomeempresa"));
				cliente.setCnpj(result.getString("cnpj"));
				cliente.setEmail(result.getString("email"));
				cliente.setTelefone(result.getString("telefone"));
				cliente.getEndereco().setCep(result.getString("cep"));
				cliente.getEndereco().setCidade(result.getString("cidade"));
				cliente.getEndereco().setEstado(result.getString("estado"));
				cliente.getEndereco().setRua(result.getString("rua"));
				lista.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public List<Calcados> BuscaCalcados() {
		List<Calcados> lista = new ArrayList<Calcados>();
		String sql = "select * from Produtos";
		try {
			Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Calcados calcado = new Calcados();
				calcado.setNome(result.getString("modelo"));
				calcado.setNumero(result.getString("numero"));
				calcado.setGenero(result.getString("genero"));
				calcado.setEstilo(result.getString("estilo"));
				calcado.setCor(result.getString("cor"));
				calcado.setId(result.getString("IdProduto"));
				lista.add(calcado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Fornecedor> BuscaFornecedores() {
		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		String sql = "select * from forenecedores";
		try {
			Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.setCNPJ(result.getString("cnpj"));
				fornecedor.setContato(result.getString("contato"));
				fornecedor.setEmail(result.getString("email"));
				fornecedor.setTelefone(result.getString("telefone"));
				fornecedor.setNome_Empresa(result.getString("nomeempresa"));
				fornecedor.getEndereco().setCep(result.getString("cep"));
				fornecedor.getEndereco().setCidade(result.getString("cidade"));
				fornecedor.getEndereco().setEstado(result.getString("estado"));
				fornecedor.getEndereco().setRua(result.getString("rua"));
				
				lista.add(fornecedor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public List<Pedidos> BuscaPedidos() {
		List<Pedidos> lista = new ArrayList<Pedidos>();
		String sql = "";
		try {
			Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Pedidos p = new Pedidos();
				p.setId(result.getString(""));
				p.setCnpj(result.getString(""));
				p.setProduto(result.getString(""));
				p.setData(result.getString(""));
				p.setFormapg(result.getString(""));
				p.setQuantidade(result.getString(""));
				p.setPreco(result.getString(""));
				
				lista.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Material> BuscaMaterial() {
		List<Material> lista = new ArrayList<Material>();
		String sql = "select descricao,medida,nome,quantidade,unidade from fornecer";
		try {
			Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Material material = new Material();
				material.setDescricao(result.getString("descricao"));
				material.setMedida(result.getString("medida"));
				material.setNome(result.getString("nome"));
				material.setQuantidade(result.getString("quantidade"));
				material.setUnidade(result.getString("unidade"));
				lista.add(material);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
