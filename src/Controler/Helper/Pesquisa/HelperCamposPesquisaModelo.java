package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPesquisaModelo {
	private String modelo;
	
	public HelperCamposPesquisaModelo(HttpServletRequest request) {
		this.modelo = request.getParameter("campo_pesquisa_modelo");
	}
	
	public String getModelo() {
		return modelo;
	}
}
