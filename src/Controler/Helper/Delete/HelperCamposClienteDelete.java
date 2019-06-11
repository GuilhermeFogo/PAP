package Controler.Helper.Delete;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposClienteDelete {
	private String cod;
	
	public HelperCamposClienteDelete(HttpServletRequest request) {
		this.cod = request.getParameter("campo_cliente_nome_del");
	}
	
	public String getCod() {
		return cod;
	}
}
