package Controler.Helper.Delete;

import javax.servlet.http.HttpServletRequest;

public class HeperCamposSolicitacaoDelete {
	private String cod;
	
	public HeperCamposSolicitacaoDelete(HttpServletRequest request) {
		this.cod = request.getParameter("campo_material_codigo_del");
	}
	
	public String getCod() {
		return cod;
	}
}
