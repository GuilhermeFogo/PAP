package Controler.Helper.Delete;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposProdutosDelete {
	private String cod;
	
	public HelperCamposProdutosDelete(HttpServletRequest request) {
		this.cod = request.getParameter("campo_produto_codigo_del");
	}
	
	public String getCod() {
		return cod;
	}
}
