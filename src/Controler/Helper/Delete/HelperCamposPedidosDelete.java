package Controler.Helper.Delete;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPedidosDelete {
	private String cod;
	
	public HelperCamposPedidosDelete(HttpServletRequest request) {
		this.cod = request.getParameter("campo_pedido_del");
	}
	
	public String getCod() {
		return cod;
	}
}
