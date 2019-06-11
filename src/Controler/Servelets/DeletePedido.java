package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Delete.HelperCamposPedidosDelete;
import DAO.CRUD_Deletar;
import Modal.Pedidos;

/**
 * Servlet implementation class DeletePedido
 */
@WebServlet("/DeletePedido")
public class DeletePedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePedido() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposPedidosDelete campos = new HelperCamposPedidosDelete(request);
		Pedidos p = new Pedidos();
		p.setId(campos.getCod());
		CRUD_Deletar delete = new CRUD_Deletar();
		delete.Deletar(p);
		
		request.getRequestDispatcher("/Financeiro").forward(request, response);
		
		
		
	}

}
