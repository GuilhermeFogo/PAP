<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CRUD_Visualizar"%>
<%@page import="Modal.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
CRUD_Visualizar buscar = new CRUD_Visualizar();
List<Cliente> lista = buscar.BuscarClientes();
%>
<section class="container">
        <table class="table" id="tabela_tudo">
            <thead>
                <tr>
                    <th>Nome empresa</th>
                    <th>CNPJ</th>
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
                	for(Cliente cliente: lista){
                		out.print("<tr>");
                		out.print("<td scope='row'>"+ cliente.getNome()+"</td>");
        				out.print("<td>"+ cliente.getCnpj()+"</td>");
        				out.print("<td>"+ cliente.getContato()+"</td>");
        				out.print("<td>"+ cliente.getEmail()+"</td>");
        				out.print("<td>"+ cliente.getTelefone()+"</td>");
        				out.print("<td>"+ cliente.getEndereco().getCep()+"</td>");
        				out.print("<td>"+ cliente.getEndereco().getCidade()+"</td>");
        				out.print("<td>"+ cliente.getEndereco().getEstado()+"</td>");
        				out.print("<td>"+ cliente.getEndereco().getRua()+"</td>");
        				
        				out.print("</tr>");
                	}
                %>
            </tbody>
        </table>
    </section>