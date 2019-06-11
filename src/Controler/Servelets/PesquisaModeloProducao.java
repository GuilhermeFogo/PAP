package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Pesquisa.HelperCamposPesquisaModelo;
import DAO.CRUD_Pesquisa;
import Modal.Calcados;

/**
 * Servlet implementation class PesquisaModeloProducao
 */
@WebServlet("/PesquisaModeloProducao")
public class PesquisaModeloProducao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisaModeloProducao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		request.getRequestDispatcher("./Producao/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Producao/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/pesquisa_Material.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/pesquisa_Modelo.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/pesquisa_CategoriaGenero.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/producao_costura.jsp").include(request, response);
		
		request.getRequestDispatcher("./Producao/TabelaTudo_Calcado.jsp").include(request, response);

		//		request.getRequestDispatcher("./Producao/producaoPacotes.jsp").include(request, response);
		request.getRequestDispatcher("Footer.jsp").include(request, response);
		out.print("</main>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposPesquisaModelo campo = new HelperCamposPesquisaModelo(request);
		Calcados cal = new Calcados();
		cal.setNome(campo.getModelo());
		CRUD_Pesquisa pesquisa = new CRUD_Pesquisa();
		List<Calcados> lista = pesquisa.PesquisaCalcadoModelo(cal);
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		request.getRequestDispatcher("./Producao/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Producao/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/pesquisa_Material.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/pesquisa_Modelo.jsp").include(request, response);
		request.getRequestDispatcher("./Producao/pesquisa_CategoriaGenero.jsp").include(request, response);
		
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
		
		out.print("</main>");
		out.print("</body>");
		out.print("</html>");
	}

}
