package Controler.Helper.Cadastra;

import javax.servlet.http.HttpServletRequest;

import Modal.Cliente;
public class HelperClienteCadastra {
	private String nomeEmpresa;
	private String cnpj;
	private String rua;
	private String cidade;
	private String estado;
	private String cep; 
	private String email;
	private String telefone;
	//private String cod;
	private String contato;
	
	
	public HelperClienteCadastra(HttpServletRequest request) {
		this.nomeEmpresa = request.getParameter("campo_cliente_nome");
		this.cnpj = request.getParameter("campo_cliente_cnpj");
		this.rua = request.getParameter("campo_cliente_rua");
		this.cidade = request.getParameter("campo_cliente_cidade");
		this.estado = request.getParameter("campo_cliente_estado");
		this.cep = request.getParameter("campo_cliente_cep");
		this.email = request.getParameter("campo_cliente_email");
		this.telefone = request.getParameter("campo_cliente_telefone");
		//this.cod = request.getParameter("campo_cliente_cod");
		this.contato = request.getParameter("campo_cliente_contato");
	}
	
	public String getContato() {
		return contato;
	}
	
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getEstado() {
		return estado;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public String getRua() {
		return rua;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
