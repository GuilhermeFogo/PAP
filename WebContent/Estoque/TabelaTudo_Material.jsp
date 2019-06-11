<%@page import="Modal.Material"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CRUD_Visualizar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
CRUD_Visualizar buscar = new CRUD_Visualizar();
List<Material>lista = buscar.BuscaMaterial();
%>
<section class="container">
        <table class="table" id="tabela_tudo">
            <thead>
                <tr>
                    <th>Cod</th>
                    <th>Nome Material</th>
                    <th>Medida</th>
                    <th>Unidade</th>
                    <th>Descricao</th>
                    <th>CodFornecedor</th>
                </tr>
            </thead>
            <tbody>
                    <%
                	for(Material material: lista){
                		out.print("<tr>");
                		out.print("<td scope='row'>"+ material.getId()+"</td>");
        				out.print("<td>"+ material.getNome()+"</td>");
        				out.print("<td>"+ material.getMedida()+"</td>");
        				out.print("<td>"+ material.getUnidade()+"</td>");
        				out.print("<td>"+ material.getDescricao()+"</td>");
        				
        				
        				out.print("</tr>");
                	}
                %>
            </tbody>
        </table>
    </section>