package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Estoque")
public class Estoque extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Estoque() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		request.getRequestDispatcher("./Estoque/TabelaTudo.jsp").include(request, response);
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
		//request.getRequestDispatcher("Estoque.jsp").include(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
