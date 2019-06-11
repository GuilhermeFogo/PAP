package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class CRUD_Pesquisa {
	private Connection conn;
	
	public CRUD_Pesquisa () {
		this.conn = new ConexaoOracle().Conectar();
	}
	
	public List<Cliente> PesquisaNomeEmpresa(Cliente cliente) {
		List<Cliente> lista = new ArrayList<Cliente>();
		String sql ="select * from clientee where nomeempresa=?";
		try {
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, cliente.getNome());
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
				cliente.setId(result.getString("IDCliente"));
				cliente.setNome(result.getString("nomeempresa"));
				cliente.setCnpj(result.getString("cnpj"));
				cliente.setContato(result.getString("contato"));
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
	
	
	public List<Calcados> PesquisaCalcadoModelo(Calcados calcados) {
		List<Calcados> lista = new ArrayList<Calcados>();
		String sql ="select * from produtos where modelo =?";
		try {
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, calcados.getNome());
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
				calcados.setNome(result.getString("modelo"));
				calcados.setNumero(result.getString("numero"));
				calcados.setGenero(result.getString("genero"));
				calcados.setEstilo(result.getString("estilo"));
				calcados.setCor(result.getString("cor"));
				calcados.setId(result.getString("IdProduto"));
				
				lista.add(calcados);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	
	public List<Calcados> PesquisaCalcadoGenero(Calcados calcados) {
		List<Calcados> lista = new ArrayList<Calcados>();
		String sql ="select * from produto where genero =?";
		try {
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, calcados.getGenero());
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
				calcados.setNome(result.getString("modelo"));
				calcados.setNumero(result.getString("numero"));
				calcados.setGenero(result.getString("genero"));
				calcados.setEstilo(result.getString("estilo"));
				calcados.setCor(result.getString("cor"));
				calcados.setId(result.getString("IdProduto"));
				lista.add(calcados);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public List<Fornecedor> PesquisaFornecedores(Fornecedor fornecedor) {
		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		String sql ="select * from Fornedores where idfornecedor = ?";
		try {
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, fornecedor.getId());
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
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
	
	public List<Pedidos> PesquisaPedidos(Pedidos pedidos) {
		List<Pedidos> lista = new ArrayList<Pedidos>();
		String sql ="";
		try {
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, pedidos.getId());
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
				pedidos.setCnpj(result.getString(""));
				pedidos.setData(result.getString(""));
				pedidos.setFormapg(result.getString(""));
				pedidos.setId(result.getString(""));
				pedidos.setPreco(result.getString(""));
				pedidos.setProduto(result.getString(""));
				pedidos.setQuantidade(result.getString(""));
				lista.add(pedidos);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Material> PesquisaMateriais(Material material) {
		List<Material> lista = new ArrayList<Material>();
		String sql ="select descricao,medida,nome,quantidade,unidade from fornecer";
		try {
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, material.getNome());
			ResultSet result = prepara.executeQuery();
			while (result.next()) {
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
