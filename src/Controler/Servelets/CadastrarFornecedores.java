package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperCamposFornecedoresCadastra;
import DAO.CRUD_Inserir;
import Modal.Fornecedor;

/**
 * Servlet implementation class CadastrarFornecedores
 */
@WebServlet("/CadastrarFornecedores")
public class CadastrarFornecedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarFornecedores() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposFornecedoresCadastra campos = new HelperCamposFornecedoresCadastra(request);
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setCNPJ(campos.getCnpj());
		fornecedor.setContato(campos.getContato());
		fornecedor.setEmail(campos.getEmail());
		fornecedor.setNome_Empresa(campos.getNome());
		fornecedor.setTelefone(campos.getTelefone());
		fornecedor.getEndereco().setCep(campos.getCep());
		fornecedor.getEndereco().setCidade( campos.getCidade());
		fornecedor.getEndereco().setEstado(campos.getEstato());
		fornecedor.getEndereco().setRua(campos.getRua());
		
		CRUD_Inserir inserir = new CRUD_Inserir();
		inserir.Inserir(fornecedor);

		request.getRequestDispatcher("/Financeiro").forward(request, response);
		
		
	}

}
