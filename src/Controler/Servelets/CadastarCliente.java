package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperClienteCadastra;
import DAO.CRUD_Inserir;
import Modal.Cliente;


/**
 * Servlet implementation class CadastarCliente
 */
@WebServlet("/CadastarCliente")
public class CadastarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperClienteCadastra campos = new HelperClienteCadastra(request);
		
		Cliente cliente  = new Cliente();
		cliente.setCnpj(campos.getCnpj());
		cliente.setContato(campos.getContato());
		cliente.setEmail(campos.getEmail());
		cliente.setNome(campos.getNomeEmpresa());
		cliente.setTelefone(campos.getTelefone());
		cliente.getEndereco().setCep(campos.getCep());
		cliente.getEndereco().setCidade( campos.getCidade());
		cliente.getEndereco().setEstado(campos.getEstado());
		cliente.getEndereco().setRua(campos.getRua());
		
		CRUD_Inserir inserir = new CRUD_Inserir();		
		inserir.Inserir(cliente);
		
		request.getRequestDispatcher("/Financeiro").forward(request, response);
		
	}

}
