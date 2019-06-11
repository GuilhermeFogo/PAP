package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PesquisaCalcado
 */
@WebServlet("/PesquisaCalcado")
public class PesquisaCalcado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisaCalcado() {
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
		
		request.getRequestDispatcher("./Estoque/TabelaTudo_Calcado.jsp").include(request, response);
		
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
