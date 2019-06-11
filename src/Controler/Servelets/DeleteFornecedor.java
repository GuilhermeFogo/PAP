package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperCamposPedidosCadastra;
import Controler.Helper.Delete.HelperCamposFornecedorDelete;
import Controler.Helper.Delete.HelperCamposPedidosDelete;
import DAO.CRUD_Deletar;
import Modal.Fornecedor;

/**
 * Servlet implementation class DeleteFornecedor
 */
@WebServlet("/DeleteFornecedor")
public class DeleteFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFornecedor() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposFornecedorDelete campos = new HelperCamposFornecedorDelete(request);
		Fornecedor fo = new Fornecedor();
		CRUD_Deletar delete = new CRUD_Deletar();
		delete.Deletar(fo);
		
		request.getRequestDispatcher("/Financeiro").include(request, response);
		
	}

}
