package Controler.Helper.Delete;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposFornecedorDelete {
	private String cod;
	
	public HelperCamposFornecedorDelete(HttpServletRequest request) {
		this.cod = request.getParameter("campo_fornecedor_del");
	}
	
	public String getCod() {
		return cod;
	}
}
