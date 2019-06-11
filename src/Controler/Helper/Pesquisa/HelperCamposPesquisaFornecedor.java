package Controler.Helper.Pesquisa;

import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.regexp.internal.recompile;

public class HelperCamposPesquisaFornecedor {
	private String cod;
	public HelperCamposPesquisaFornecedor(HttpServletRequest req) {
		this.cod = req.getParameter("campo_pesquisa_codigo_fornecedor");
	}
	
	public String getCod() {
		return cod;
	}
}
