<%@page import="Modal.Calcados"%>
<%@page import="Modal.Pedidos"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CRUD_Visualizar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
CRUD_Visualizar buscar = new CRUD_Visualizar();
List<Calcados>lista = buscar.BuscaCalcados();
%>
<section class="container">
        <table class="table" id="tabela_tudo">
            <thead>
                <tr>
                    <th>Cod</th>
                    <th>Estilo</th>
                    <th>Genero</th>
                    <th>Modelo</th>
                    <th>Numero</th>
                    <th>Quantidade</th>
                </tr>
            </thead>
            <tbody>
                    <%
                	for(Calcados calcados: lista){
                		out.print("<tr>");
                		out.print("<td scope='row'>"+ calcados.getId()+"</td>");
        				out.print("<td>"+ calcados.getEstilo()+"</td>");
        				out.print("<td>"+ calcados.getGenero()+"</td>");
        				out.print("<td>"+ calcados.getNome()+"</td>");
        				out.print("<td>"+ calcados.getNumero()+"</td>");
        				out.print("<td>"+ calcados.getQuantidade()+"</td>");
        				
        				out.print("</tr>");
                	}
                %>
            </tbody>
        </table>
    </section>