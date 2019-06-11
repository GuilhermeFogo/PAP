package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPesquisaPedidos {
	private String cod;
	
	public HelperCamposPesquisaPedidos(HttpServletRequest req) {
		this.cod = req.getParameter("campo_pesquisa_pedido");
	}
	
	public String getCod() {
		return cod;
	}
}
