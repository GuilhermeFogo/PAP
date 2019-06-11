package Controler.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controler.Helper.Cadastra.HelperCamposPedidosCadastra;
import DAO.CRUD_Inserir;
import Modal.Pedidos;

/**
 * Servlet implementation class CadastroPedidos
 */
@WebServlet("/CadastroPedidos")
public class CadastroPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroPedidos() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelperCamposPedidosCadastra campos = new HelperCamposPedidosCadastra(request);
		Pedidos p = new Pedidos();
		p.setCnpj(campos.getCnpj());
		p.setData(campos.getData());
		p.setFormapg(campos.getFormaPagamento());
		p.setPreco(campos.getPreco());
		p.setProduto(campos.getProduto());
		p.setQuantidade(campos.getQuantidade());
		
		CRUD_Inserir inserir = new CRUD_Inserir();
		inserir.Inserir(p);
		
		request.getRequestDispatcher("/Financeiro").include(request, response);
		
	}

}
