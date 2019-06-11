package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperProdutoCadastra;
import Controler.Helper.Delete.HelperCamposProdutosDelete;
import DAO.CRUD_Inserir;
import Modal.Calcados;

/**
 * Servlet implementation class CadastroCalcados
 */
@WebServlet("/CadastroCalcados")
public class CadastroCalcados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroCalcados() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperProdutoCadastra campos = new HelperProdutoCadastra(request);
		Calcados calcado = new Calcados();
		calcado.setCor(campos.getCor());
		calcado.setGenero(campos.getGenero());
		calcado.setEstilo(campos.getEstilo());
		calcado.setNome(campos.getModelo());
		calcado.setNumero(campos.getNumero());
		calcado.setQuantidade(campos.getQuantidade());
		
		CRUD_Inserir inserir = new CRUD_Inserir();
		inserir.Inserir(calcado);
		
		request.getRequestDispatcher("/Estoque").include(request, response);
	}

}
