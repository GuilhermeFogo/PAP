package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPesquisaCategoraGenero {
	
	private String genero;
	
	public HelperCamposPesquisaCategoraGenero(HttpServletRequest request) {
		this.genero = request.getParameter("campo_pesquisa_genero");
	}

	public String getGenero() {
		return genero;
	}
}
