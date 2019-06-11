package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Pesquisa.HelperCamposPesquisaFornecedor;
import Controler.Helper.Pesquisa.HelperCamposPesquisaPedidos;
import DAO.CRUD_Pesquisa;
import Modal.Fornecedor;
import Modal.Pedidos;

/**
 * Servlet implementation class PesquisaPedido
 */
@WebServlet("/PesquisaPedido")
public class PesquisaPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisaPedido() {
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
		request.getRequestDispatcher("./Financeiro/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Financeiro/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaPedido.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaSolicitacao.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaFornecedor.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaCliente.jsp").include(request, response);

		request.getRequestDispatcher("./Financeiro/financeiro_tabela_tudo_Pedidos.jsp").include(request,
				response);

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
		HelperCamposPesquisaPedidos campos = new HelperCamposPesquisaPedidos(request);
		Pedidos pe = new Pedidos();
		pe.setId(campos.getCod());
		CRUD_Pesquisa pesquisa = new CRUD_Pesquisa();
		List<Pedidos> lista = pesquisa.PesquisaPedidos(pe);
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
		out.print("<div class='container'>");
		out.print("<table class='table' id='tabela_tudo'>");
		out.print("<thead>");
		out.print("<tr>");
		out.print("<th>Nome empresa</th>\r\n" + 
				"                    <th>CNPJ</th>\r\n" + 
				"                    <th>Data</th>\r\n" + 
				"                    <th>Forma Pagamento</th>\r\n" + 
				
				"                    <th>Preco</th>\r\n"+
				"                    <th>CodProduto</th>\r\n" + 
				"                    <th>Quantidade</th>\r\n" + 
				"                    <th>Cod</th>");
		out.print("</tr>");
		out.print("</thead>");
		out.print("<tbody>");
		for (Pedidos pedidos : lista) {
			out.print("<tr>");
			out.print("<td scope='row'>"+ pedidos.getCnpj()+"</td>");
			out.print("<td>"+ pedidos.getData()+"</td>");
			out.print("<td>"+ pedidos.getFormapg()+"</td>");
			
			out.print("<td>"+ pedidos.getPreco()+"</td>");
			out.print("<td>"+ pedidos.getProduto()+"</td>");
			out.print("<td>"+ pedidos.getQuantidade()+"</td>");
			out.print("<td>"+ pedidos.getId()+"</td>");
			out.print("</tr>");

		}
		out.print("</tbody>");
		out.print("</table>");
		out.print("</div>");
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

}
