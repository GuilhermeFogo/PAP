package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPesquisaCliente {
	private String nome;
	public HelperCamposPesquisaCliente(HttpServletRequest req) {
		this.nome = req.getParameter("campo_pesquisa_nome_cliente");
	}
	
	public String getNome() {
		return nome;
	}
}
