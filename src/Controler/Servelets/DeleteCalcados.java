package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Delete.HelperCamposProdutosDelete;
import DAO.CRUD_Deletar;
import Modal.Calcados;

/**
 * Servlet implementation class DeleteCalcados
 */
@WebServlet("/DeleteCalcados")
public class DeleteCalcados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCalcados() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposProdutosDelete campos = new HelperCamposProdutosDelete(request);
		Calcados calcados = new Calcados();
		calcados.setId(campos.getCod());
		CRUD_Deletar delete = new CRUD_Deletar();
		delete.Deletar(calcados);
		
		request.getRequestDispatcher("/Estoque").forward(request, response);
	}

}
