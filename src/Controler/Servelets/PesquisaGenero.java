package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Pesquisa.HelperCamposPesquisaCategoraGenero;
import Controler.Helper.Pesquisa.HelperCamposPesquisaModelo;
import DAO.CRUD_Pesquisa;
import Modal.Calcados;

/**
 * Servlet implementation class PesquisaGenero
 */
@WebServlet("/PesquisaGenero")
public class PesquisaGenero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisaGenero() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposPesquisaCategoraGenero campo = new HelperCamposPesquisaCategoraGenero(request);
		Calcados cal = new Calcados();
		cal.setNome(campo.getGenero());
		CRUD_Pesquisa pesquisa = new CRUD_Pesquisa();
		List<Calcados> lista = pesquisa.PesquisaCalcadoModelo(cal);
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		request.getRequestDispatcher("./Estoque/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Estoque/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/pesquisa_Material.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/pesquisa_Modelo.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/pesquisa_CategoriaGenero.jsp").include(request, response);
		
		out.print("<div class='container'>");
		out.print("<table class='table' id='tabela_tudo'>");
		out.print("<thead>");
		out.print("<tr>");
		out.print("<th>Cod</th>\r\n" + 
				" <th>Estilo</th>\r\n" + 
				"<th>Genero</th>\r\n" + 
				"<th>Modelo</th>\r\n" + 
				"<th>Numero</th>\r\n" + 
				"<th>Quantidade</th>");
		out.print("</tr>");
		out.print("</thead>");
		out.print("<tbody>");
			for (Calcados calcados : lista) {
				out.print("<tr>");
				out.print("<td scope='row'>"+ calcados.getId()+"</td>");
				out.print("<td>"+ calcados.getEstilo()+"</td>");
				out.print("<td>"+ calcados.getGenero()+"</td>");
				out.print("<td>"+ calcados.getNome()+"</td>");
				out.print("<td>"+ calcados.getNumero()+"</td>");
				out.print("<td>"+ calcados.getQuantidade()+"</td>");
				out.print("</tr");
			}
		out.print("</tbody>");
		out.print("</table>");
		out.print("</div>");
		
		request.getRequestDispatcher("./Estoque/estoque_materialCadastra.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/estoque_produtosCadastra.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/estoque_solicitacaoCadastra.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/estoque_produtoDelete.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/estoque_solicitacaoDel.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/estoque_materaisDelete.jsp").include(request, response);
		request.getRequestDispatcher("Footer.jsp").include(request, response);
		out.print("</main>");
		out.print("</body>");
		out.print("</html>");
	}

}
