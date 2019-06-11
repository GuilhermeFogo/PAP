<%@page import="Modal.Pedidos"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CRUD_Visualizar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
CRUD_Visualizar buscar = new CRUD_Visualizar();
List<Pedidos> lista = buscar.BuscaPedidos();
%>
<section class="container">
        <table class="table" id="tabela_tudo">
            <thead>
                <tr>
                    <th>CNPJ</th>
                    <th>Data</th>
                    <th>Forma Pagamento</th>
                    
                    <th>Preco</th>
                    <th>Cod Produto</th>
                    <th>Quantidade</th>
                    <th>Cod</th>
                </tr>
            </thead>
            <tbody>
                    <%
                	for(Pedidos pedidos: lista){
                		out.print("<tr>");
                		out.print("<td scope='row'>"+ pedidos.getCnpj()+"</td>");
        				out.print("<td>"+ pedidos.getData()+"</td>");
        				out.print("<td>"+ pedidos.getFormapg()+"</td>");
        				
        				out.print("<td>"+ pedidos.getPreco()+"</td>");
        				out.print("<td>"+ pedidos.getProduto()+"</td>");
        				out.print("<td>"+ pedidos.getQuantidade()+"</td>");
        				out.print("<td>"+ pedidos.getQuantidade()+"</td>");
        				out.print("<td>"+ pedidos.getId()+"</td>");
        				
        				out.print("</tr>");
                	}
                %>
            </tbody>
        </table>
    </section>