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

import Controler.Helper.Cadastra.HelperClienteCadastra;
import Controler.Helper.Delete.HelperCamposClienteDelete;
import Controler.Helper.Pesquisa.HelperCamposPesquisaCliente;
import DAO.CRUD_Pesquisa;
import DAO.CRUD_Visualizar;
import Modal.Cliente;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 * Servlet implementation class PesquisaCliente
 */
@WebServlet("/PesquisaCliente")
public class PesquisaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PesquisaCliente() {
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
		request.getRequestDispatcher("./Financeiro/Head.jsp").include(request, response);
		out.print("<body>");
		out.print("<main>");
		request.getRequestDispatcher("./Financeiro/Header.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/Menu.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaPedido.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaSolicitacao.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaFornecedor.jsp").include(request, response);
		request.getRequestDispatcher("./Financeiro/financeiro_pesquisaCliente.jsp").include(request, response);

		request.getRequestDispatcher("./Financeiro/financeiro_tabela_tudo_pesquisaCliente.jsp").include(request,
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HelperCamposPesquisaCliente campos = new HelperCamposPesquisaCliente(request);
		Cliente cli = new Cliente();
		cli.setNome(campos.getNome());
		CRUD_Pesquisa pesquisa = new CRUD_Pesquisa();
		List<Cliente> pesquisaCliente = pesquisa.PesquisaNomeEmpresa(cli);
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
		out.print("<th>Nome da empresa</th>");
		out.print("<th>CNPJ</th>");
		out.print("<th>Contato</th>");
		out.print("<th>Email</th>");
		out.print("<th>CEP</th>\r\n" + 
				"<th>Cidade</th>\r\n" + 
				"<th>Estado</th>\r\n" + 
				"<th>Rua</th>");
		out.print("</tr>");
		out.print("</thead>");
		out.print("<tbody>");
		for (Cliente cliente : pesquisaCliente) {
			out.print("<tr>");
			out.print("<td scope='row'>"+ cliente.getNome()+"</td>");
			out.print("<td>"+ cliente.getCnpj()+"</td>");
			out.print("<td>"+ cliente.getContato()+"</td>");
			out.print("<td>"+ cliente.getEmail()+"</td>");
			out.print("<td>"+ cliente.getTelefone()+"</td>");
			out.print("<td>"+ cliente.getEndereco().getCep()+"</td>");
			out.print("<td>"+ cliente.getEndereco().getCidade()+"</td>");
			out.print("<td>"+ cliente.getEndereco().getEstado()+"</td>");
			out.print("<td>"+ cliente.getEndereco().getRua()+"</td>");
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
