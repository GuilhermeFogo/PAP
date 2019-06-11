package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPesquisaMaterial {
	private String nome_material;
	
	public HelperCamposPesquisaMaterial(HttpServletRequest request) {
		this.nome_material = request.getParameter("campo_pesquisa_material");
	}
	
	public String getNome_material() {
		return nome_material;
	}
}
