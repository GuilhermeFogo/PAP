package Controler.Helper.Cadastra;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposFornecedoresCadastra {
	private String cod;
	private String nome;
	private String cnpj;
	private String email;
	private String contato;
	private String telefone;
	private String rua;
	private String cidade;
	private String estato;
	private String cep;
	
	public HelperCamposFornecedoresCadastra(HttpServletRequest request) {
		this.cod = request.getParameter("campo_fornecedor_cod");
		this.nome = request.getParameter("campo_fornecedor_nome");
		this.cnpj = request.getParameter("campo_fornecedor_cnpj");
		this.email = request.getParameter("campo_fornecedor_email");
		this.contato = request.getParameter("campo_fornecedor_contato");
		this.telefone = request.getParameter("campo_fornecedor_telefone");
		this.rua = request.getParameter("campo_fornecedor_rua");
		this.cidade = request.getParameter("campo_fornecedor_cidade");
		this.estato = request.getParameter("campo_fornecedor_estado");
		this.cep = request.getParameter("campo_fornecedor_cep");
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
	public String getCod() {
		return cod;
	}public String getContato() {
		return contato;
	}
	public String getEmail() {
		return email;
	}public String getEstato() {
		return estato;
	}
	public String getNome() {
		return nome;
	}
	public String getRua() {
		return rua;
	}public String getTelefone() {
		return telefone;
	}
	
}
