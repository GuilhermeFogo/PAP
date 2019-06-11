package Controler.Helper.Delete;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposMaterialDelete {
	private String cod;
	
	public HelperCamposMaterialDelete(HttpServletRequest request) {
		this.cod = request.getParameter("campo_material_codigo_del");
	}
	
	public String getCod() {
		return cod;
	}

}
