package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Delete.HelperCamposClienteDelete;
import DAO.CRUD_Deletar;
import Modal.Cliente;

/**
 * Servlet implementation class DeleleCliente
 */
@WebServlet("/DeleleCliente")
public class DeleleCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleleCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposClienteDelete campos = new HelperCamposClienteDelete(request);
		Cliente cliente = new Cliente();
		cliente.setId(campos.getCod());
		
		CRUD_Deletar deletar = new CRUD_Deletar();
		deletar.Deletar(cliente);
		
		request.getRequestDispatcher("/Financeiro").forward(request, response);
		
		
	}

}
