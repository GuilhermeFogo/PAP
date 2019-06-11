package Controler.Helper;

import javax.servlet.http.HttpServletRequest;

public class HelperLogin {
	private String user;
	private String senha;
	private String perfil;
	
	public HelperLogin(HttpServletRequest requet) {
		this.user = requet.getParameter("campo_usu");
		this.senha = requet.getParameter("campo_senha");
		this.perfil = requet.getParameter("campo_perfil");
	}
	
	public String getPerfil() {
		return perfil;
	}
	public String getSenha() {
		return senha;
	}
	
	public String getUser() {
		return user;
	}
	
	
	
}
