package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import DAO.Conexoes.ConexaoOracle;
import Modal.Calcados;
import Modal.Cliente;
import Modal.Fornecedor;
import Modal.Material;
import Modal.Pedidos;
import Modal.Solicitacao;
import Modal.Usuario;

public class CRUD_Inserir {
	private Connection conn;

	public CRUD_Inserir() {
		this.conn = new ConexaoOracle().Conectar();
	}

	public void Inserir(Usuario usuario) {
		try {
			String sql = "insert into Usuario(id,nome, senha,perfil) values(SEQ_USUARIO.nextval,?,?,?)";

			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, usuario.getNome());
			prepara.setString(2, usuario.getSenha());
			prepara.setString(3, usuario.getPerfil());
			prepara.execute();

			prepara = this.conn.prepareStatement("commit");
			prepara.execute();

			prepara.close();
			this.conn.close();
		} catch (SQLException e) {
			String mensagem = e.getMessage();
			System.out.println(mensagem);
		}

	}

	public void Inserir(Cliente cliente) {
		try {

			String sqlcidade = "insert into Cidade(idCidade,idEstado,cidade) values(seq_Cidade.nextval,?,?)";
			String sql = "INSERT into cliente(idcliente,nomeempresa,contato,email,telefone,cnpj,rua,idCidade,cep)"
					+ " VALUES(SEQ_CLIENTE.nextval,?,?,?,?,?,?,seq_Cidade.currval,?)";

			PreparedStatement prepare = this.conn.prepareStatement(sqlcidade);
			prepare.setString(1, cliente.getEndereco().getEstado());
			prepare.setString(2, cliente.getEndereco().getCidade());
			prepare.execute();
			prepare.close();
			
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, cliente.getNome());
			prepara.setString(2, cliente.getContato());
			prepara.setString(3, cliente.getEmail());
			prepara.setString(4, cliente.getTelefone());
			prepara.setString(5, cliente.getCnpj());
			prepara.setString(6, cliente.getEndereco().getRua());
			prepara.setString(7, cliente.getEndereco().getCep());

			prepara.execute();
			prepara.close();

			PreparedStatement preparac = this.conn.prepareStatement("commit");
			preparac.execute();

			preparac.close();
			this.conn.close();
		} catch (SQLException e) {
			String mensagem = e.getMessage();
			System.out.println(mensagem);
		}
	}

	public void Inserir(Calcados calcado) {
		try {
			String sql = "insert into Produto(idProduto,idGenero,nome,numero,idEstilo) values(Seq_produto.nextval,?,?,?,?)";

			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, calcado.getGenero());
			prepara.setString(2, calcado.getNome());
			prepara.setString(3, calcado.getNumero());
			prepara.setString(4, calcado.getEstilo());
			prepara.execute();

			prepara.close();

			PreparedStatement prepara1 = this.conn.prepareStatement("commit");
			prepara1.execute();

			prepara1.close();
			this.conn.close();
		} catch (SQLException e) {
			String mensagem = e.getMessage();
			System.out.println(mensagem);
		}
	}

	public void Inserir(Fornecedor fornecedor) {
		try 	{
			
			String sqlcidade = "insert into Cidade(idCidade,idEstado,cidade) values(seq_Cidade.nextval,?,?)";
			String sql = "insert into fornecdor(idFornecedor,nomeempresa,contato,email,telefone,cnpj,rua,idCidade,cep) "
					+ "values(SEQ_FORNECEDOR.nextval,?,?,?,?,?,?,seq_Cidade.currval,?)";
			
			PreparedStatement prepare = this.conn.prepareStatement(sqlcidade);
			prepare.setString(1, fornecedor.getEndereco().getEstado());
			prepare.setString(2, fornecedor.getEndereco().getCidade());
			prepare.execute();
			prepare.close();
			
			PreparedStatement prepara = this.conn.prepareStatement(sql);
			prepara.setString(1, fornecedor.getNome_Empresa());
			prepara.setString(2, fornecedor.getContato());
			prepara.setString(3, fornecedor.getEmail());
			prepara.setString(4, fornecedor.getTelefone());
			prepara.setString(5, fornecedor.getCNPJ());
			prepara.setString(6, fornecedor.getEndereco().getRua());
			prepara.setString(7, fornecedor.getEndereco().getCep());
			this.conn.close();
		} catch (SQLException e) {
			String mensagem = e.getMessage();
			System.out.println(mensagem);
		}
	}

	public void Inserir(Pedidos pedidos) {
		try {
			String sql = "insert into Vendas(idVenda,idFormaPG,idProduto,datas,preco) values(seq_Vendas.nexval,?,?,?,?";

			PreparedStatement prepae = this.conn.prepareStatement(sql);
			prepae.setString(1, pedidos.getFormapg());
			prepae.setString(2, pedidos.getProduto());
			prepae.setString(3, pedidos.getData());
			prepae.setString(4, pedidos.getPreco());
			prepae.execute();
			prepae.close();
			
			this.conn.close();
		} catch (SQLException e) {
			String mensagem = e.getMessage();
			System.out.println(mensagem);
		}
	}

	public void Inserir(Material material) {
		try {
			String sql = "insert into Material(idMaterial,nome,unidade,medida,descricao)"
					+ " values(Seq_material.nextval,?,?,?,?)";

			PreparedStatement prepare = this.conn.prepareStatement(sql);
			prepare.setString(1, material.getNome());
			prepare.setString(2, material.getUnidade());
			prepare.setString(3, material.getMedida());
			prepare.setString(4, material.getDescricao());
			prepare.execute();
			prepare.close();

			PreparedStatement p = this.conn.prepareStatement("commit");
			p.execute();
			p.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void Inserir(Solicitacao solicitacao) {
		try {
			String sql = "insert into Solicitacao(idSolicitacao,idMaterial,quantidade,descricao,datas)"
					+ "values(seq_Solicitacao.nextval,seq_Material.currval,?,?,?)";
			PreparedStatement prepara = this.conn.prepareCall(sql);
			prepara.setString(1, solicitacao.getQuantidade());
			prepara.setString(2, solicitacao.getDescricao());
			prepara.setString(3, solicitacao.getData());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
