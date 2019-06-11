package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperCamposSolicitacaoCadastra;
import Controler.Helper.Delete.HeperCamposSolicitacaoDelete;
import DAO.CRUD_Deletar;
import Modal.Solicitacao;

/**
 * Servlet implementation class DeleteSolicitacao
 */
@WebServlet("/DeleteSolicitacao")
public class DeleteSolicitacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSolicitacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HeperCamposSolicitacaoDelete campos = new HeperCamposSolicitacaoDelete(request);
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setId(campos.getCod());
		 
		CRUD_Deletar deletar = new CRUD_Deletar();
		deletar.Deletar(solicitacao);
		
		request.getRequestDispatcher("/Estoque").forward(request, response);
	}

}
