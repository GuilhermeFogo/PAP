package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperCamposSolicitacaoCadastra;
import DAO.CRUD_Inserir;
import Modal.Solicitacao;

/**
 * Servlet implementation class CadastroSolicitacao
 */
@WebServlet("/CadastroSolicitacao")
public class CadastroSolicitacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroSolicitacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposSolicitacaoCadastra campos = new HelperCamposSolicitacaoCadastra(request);
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setNomeMaterial(campos.getCod_material());
		solicitacao.setData(campos.getData());
		solicitacao.setDescricao(campos.getDescricao());
		solicitacao.setQuantidade(campos.getQuantidade());
		
		CRUD_Inserir inserir = new CRUD_Inserir();
		inserir.Inserir(solicitacao);
		
		request.getRequestDispatcher("/Estoque").forward(request, response);
	}

}
