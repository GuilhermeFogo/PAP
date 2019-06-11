package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Pesquisa.HelperCamposPesquisaMaterial;
import DAO.CRUD_Pesquisa;
import Modal.Calcados;
import Modal.Material;

/**
 * Servlet implementation class PesquisaMaterial
 */
@WebServlet("/PesquisaMaterial")
public class PesquisaMaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisaMaterial() {
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
		request.getRequestDispatcher("./Estoque/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Estoque/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/pesquisa_Material.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/pesquisa_Modelo.jsp").include(request, response);
		request.getRequestDispatcher("./Estoque/pesquisa_CategoriaGenero.jsp").include(request, response);
		
		request.getRequestDispatcher("./Estoque/TabelaTudo_Material.jsp").include(request, response);
		
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposPesquisaMaterial campo = new HelperCamposPesquisaMaterial(request);
		Material m = new Material();
		m.setNome(campo.getNome_material());
		CRUD_Pesquisa pesquisa = new CRUD_Pesquisa();
		List<Material>lista = pesquisa.PesquisaMateriais(m);
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
				"<th>Nome Material</th>\r\n" + 
				"<th>Medida</th>\r\n" + 
				"<th>Unidade</th>\r\n" + 
				"<th>Descricao</th>\r\n");
		out.print("</tr>");
		out.print("</thead>");
		out.print("<tbody>");
		for(Material material: lista){
    		out.print("<tr>");
    		out.print("<td scope='row'>"+ material.getId()+"</td>");
			out.print("<td>"+ material.getNome()+"</td>");
			out.print("<td>"+ material.getMedida()+"</td>");
			out.print("<td>"+ material.getUnidade()+"</td>");
			out.print("<td>"+ material.getDescricao()+"</td>");
			out.print("");
			
			out.print("</tr>");
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
