package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.HelperLogin;
import DAO.CRUD_Visualizar;
import DAO.Conexoes.ConexaoOracle;
import DAO.Conexoes.Conexaobd;
import Modal.Usuario;
import Controler.Helper.HelperLogin;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// pagina de login
		request.getRequestDispatcher("index.jsp").include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		// faz conexao com banco
		CRUD_Visualizar busca = new CRUD_Visualizar();
		// faz os resquest dos campos
		HelperLogin campos = new HelperLogin(request);
		/// pesquisa os usuarios e retona uma lita
		List<Usuario> lista = busca.VerUsuarios();
		
		// comparando valores do request com o banco 
		for (Usuario usuario : lista) {			
			if (campos.getUser().equals(usuario.getNome()) && campos.getSenha().equals(usuario.getSenha())) {
				
				if (usuario.getPerfil().equals("estoque")) {
					request.getRequestDispatcher("./Estoque").forward(request, response);
				}else if (usuario.getPerfil().equals("financeiro")) {
					request.getRequestDispatcher("./Financeiro").forward(request, response);
				}else {
					if (usuario.getPerfil().equals("producao")) {
						request.getRequestDispatcher("./Producao").forward(request, response);
					}
				}	
			}
		}
		out.print("<script>alert('Usuario ou Senha Invalidas')</script>");
		doGet(request, response);
	}	
}

