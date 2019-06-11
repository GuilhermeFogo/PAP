package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperMaterialCadastra;
import Controler.Helper.Delete.HelperCamposMaterialDelete;
import DAO.CRUD_Inserir;
import Modal.Material;

/**
 * Servlet implementation class CadastroMateriais
 */
@WebServlet("/CadastroMateriais")
public class CadastroMateriais extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroMateriais() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Material m = new Material();
		HelperMaterialCadastra campo = new HelperMaterialCadastra(request);
		m.setDescricao(campo.getDescricao());
		m.setNome(campo.getNome());
		m.setQuantidade(campo.getQuantidade());
		m.setUnidade(campo.getUnidade());
		m.setMedida(campo.getMedida());
		//m.getFornecedor().setId(campo.getCod_fornecedor());
		
		CRUD_Inserir inserir = new CRUD_Inserir();
		inserir.Inserir(m);
		
		request.getRequestDispatcher("/Estoque").forward(request, response);
	}

}
