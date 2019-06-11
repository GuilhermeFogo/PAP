package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Producao")
public class Producao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Producao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
		
		request.getRequestDispatcher("./Producao/TabelaTudo.jsp").include(request, response);

		//		request.getRequestDispatcher("./Producao/producaoPacotes.jsp").include(request, response);
		request.getRequestDispatcher("Footer.jsp").include(request, response);
		out.print("</main>");
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
