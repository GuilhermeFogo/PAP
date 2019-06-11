package Controler.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Pesquisa.HelperCamposPesquisaCliente;
import Controler.Helper.Pesquisa.HelperCamposPesquisaFornecedor;
import DAO.CRUD_Pesquisa;
import Modal.Cliente;
import Modal.Fornecedor;

/**
 * Servlet implementation class PesquisaFornecedor
 */
@WebServlet("/PesquisaFornecedor")
public class PesquisaFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisaFornecedor() {
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

		request.getRequestDispatcher("./Financeiro/financeiro_tabela_tudo_PesquisaFornecedor.jsp").include(request,
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposPesquisaFornecedor campos = new HelperCamposPesquisaFornecedor(request);
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(campos.getCod());
		CRUD_Pesquisa pesquisa = new CRUD_Pesquisa();
		List<Fornecedor> lista = pesquisa.PesquisaFornecedores(fornecedor);
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
				"                    <th>Contato</th>\r\n" + 
				"                    <th>Email</th>\r\n" + 
				"                    <th>Telefone</th>\r\n" + 
				"                    <th>CEP</th>\r\n" + 
				"                    <th>Cidade</th>\r\n" + 
				"                    <th>Estado</th>\r\n" + 
				"                    <th>Rua</th>");
		out.print("</tr>");
		out.print("</thead>");
		out.print("<tbody>");
		for (Fornecedor fornecedores : lista) {
			out.print("<tr>");
			out.print("<td scope='row'>"+ fornecedores.getNome_Empresa()+"</td>");
			out.print("<td>"+ fornecedores.getContato()+"</td>");
			out.print("<td>"+ fornecedores.getEmail()+"</td>");
			out.print("<td>"+ fornecedores.getTelefone()+"</td>");
			out.print("<td>"+ fornecedores.getEndereco().getCep()+"</td>");
			out.print("<td>"+ fornecedores.getEndereco().getCidade()+"</td>");
			out.print("<td>"+ fornecedores.getEndereco().getEstado()+"</td>");
			out.print("<td>"+ fornecedores.getEndereco().getRua()+"</td>");
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
