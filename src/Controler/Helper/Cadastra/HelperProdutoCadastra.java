package Controler.Helper.Cadastra;

import javax.servlet.http.HttpServletRequest;

import Modal.Calcados;

public class HelperProdutoCadastra {
	private String modelo;
	private String numero;
	private String estilo;
	private String genero;
	private String cor;
	private String quantidade;
	
	public HelperProdutoCadastra(HttpServletRequest request) {
		this.modelo = request.getParameter("campo_produto_modelo");
		this.genero = request.getParameter("campo_produto_categoria");
		this.estilo = request.getParameter("campo_produto_estilo");
		this.numero = request.getParameter("campo_produto_numero");
		this.cor = request.getParameter("campo_produto_cor");
		this.quantidade = request.getParameter("campo_produto_quantidade");
	}
	
	public String getCor() {
		return cor;
	}
	public String getQuantidade() {
		return quantidade;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getNumero() {
		return numero;
	}
}
