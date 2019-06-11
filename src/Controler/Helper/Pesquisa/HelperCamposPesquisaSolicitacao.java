package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposPesquisaSolicitacao {
	private String  cod;
	
	public HelperCamposPesquisaSolicitacao(HttpServletRequest request) {
		this.cod = request.getParameter("campo_pesquisa_solicitacao_cod");
	}
	
	public String getCod() {
		return cod;
	}
}
