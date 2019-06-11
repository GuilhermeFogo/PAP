package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Financeiro
 */
@WebServlet("/Financeiro")
public class Financeiro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public Financeiro() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		request.getRequestDispatcher("./Financeiro/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Financeiro/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaPedido.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaSolicitacao.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaFornecedor.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaCliente.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_tabelaTudo.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_clienteCadastro.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_fornecedorCadastro.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pedidoCadastro.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_fornecedorDelete.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_clienteDelete.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pedidoDelete.jsp").include(request, response);
		request.getRequestDispatcher("Footer.jsp").include(request, response);
		out.print("</main>");
		out.print("</body>");
		out.print("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
