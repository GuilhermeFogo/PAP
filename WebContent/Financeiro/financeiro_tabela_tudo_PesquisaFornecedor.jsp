<%@page import="Modal.Fornecedor"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CRUD_Visualizar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
CRUD_Visualizar buscar = new CRUD_Visualizar();
List<Fornecedor> lista = buscar.BuscaFornecedores();
%>
<section class="container">
        <table class="table" id="tabela_tudo">
            <thead>
                <tr>
                    <th>Nome empresa</th>
                    <th>Contato</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th>CEP</th>
                    <th>Cidade</th>
                    <th>Estado</th>
                    <th>Rua</th>
                </tr>
            </thead>
            <tbody>
                    <%
                	for(Fornecedor fornecedor: lista){
                		out.print("<tr>");
                		out.print("<td scope='row'>"+ fornecedor.getNome_Empresa()+"</td>");
        				out.print("<td>"+ fornecedor.getContato()+"</td>");
        				out.print("<td>"+ fornecedor.getEmail()+"</td>");
        				out.print("<td>"+ fornecedor.getTelefone()+"</td>");
        				out.print("<td>"+ fornecedor.getEndereco().getCep()+"</td>");
        				out.print("<td>"+ fornecedor.getEndereco().getCidade()+"</td>");
        				out.print("<td>"+ fornecedor.getEndereco().getEstado()+"</td>");
        				out.print("<td>"+ fornecedor.getEndereco().getRua()+"</td>");
        				
        				out.print("</tr>");
                	}
                %>
            </tbody>
        </table>
    </section>