package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Delete.HelperCamposMaterialDelete;
import DAO.CRUD_Deletar;
import Modal.Material;

/**
 * Servlet implementation class DeleteMaterial
 */
@WebServlet("/DeleteMaterial")
public class DeleteMaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMaterial() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposMaterialDelete campos = new HelperCamposMaterialDelete(request);
		Material material = new Material();
		material.setId(campos.getCod());
		CRUD_Deletar deletar = new CRUD_Deletar();
		deletar.Deletar(material);
		
		request.getRequestDispatcher("/Estoque").forward(request, response);
	}

}
