package Controler.Helper.Cadastra;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPedidosCadastra {
	private String cnpj;
	private String produtoNome;
	private String quantidade;
	private String formaPagamento;
	private String preco;
	private String data;
	
	public HelperCamposPedidosCadastra(HttpServletRequest request) {
		this.cnpj = request.getParameter("campo_pedido_cnpj_cliente");
		this.produtoNome = request.getParameter("campo_pedido_cod_produto");
		this.quantidade = request.getParameter("campo_pedido_quantidade");
		this.formaPagamento = request.getParameter("campo_pedido_forma_pagamento");
		this.preco = request.getParameter("campo_pedido_preco");
		this.data = request.getParameter("campo_pedido_datas");
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public String getData() {
		return data;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public String getPreco() {
		return preco;
	}
	public String getProduto() {
		return produtoNome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	
}
