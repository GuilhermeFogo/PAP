package Controler.Helper.Cadastra;

import javax.servlet.http.HttpServletRequest;

public class HelperCamposSolicitacaoCadastra {
	private String cod_material;
	private String quantidade;
	private String descricao;
	private String data;
	
	public HelperCamposSolicitacaoCadastra(HttpServletRequest request) {
		this.cod_material = request.getParameter("campo_solicitacao_objeto");
		this.quantidade = request.getParameter("campo_solicitacao_quantidade");
		this.descricao = request.getParameter("campo_solicitacao_descricao");
		this.data = request.getParameter("campo_solicitacao_data");
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	
	public String getCod_material() {
		return cod_material;
	}
	
	public String getData() {
		return data;
	}
	
	public String getDescricao() {
		return descricao;
	}
	


}
