<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container">
        <h2 class="estoque"></h2>
        <ul class="list-inline">
                    <li class="list-inline-item dropdown">
                        <div class="col-4">
                            <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">Cadastar</a>
                            <ul class="dropdown-menu">
                                <li class="center">
                                    <a href="#" id="mostrar_produto">Cadastro de Calçados</a>
                                </li>
                                <li class="center">
                                    <a href="#" id="mostar_materiais"> Cadastro de Materias</a>
                                </li>
                                <li class="center">
                                    <a href="#" id="mostar_solicitacoes">Solicitar Compras</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li class="list-inline-item dropdown">
                        <div class="col-4">
                            <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">Remoção</a>
                            <ul class="dropdown-menu">
                                <li class="center">
                                    <a href="#" id="remover_calcado">Remover Calçado</a>
                                </li>
                                <li class="center">
                                    <a href="#" id="remove_material"> Remover Materias</a>
                                </li>
                                <li class="center">
                                    <a href="#" id="remove_solicitacao"> Cancelamento da Solicitação</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li class="list-inline-item dropdown">
                        <div class="col-4">
                            <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">Consuta Estoque</a>
                            <ul class="dropdown-menu">
                                <li class="center">
                                    <a href="#" id="por_modelo">Por Modelo</a>
                                </li>
                                <li class="center">
                                    <a href="#" id="por_categoria">Por Gênero</a>
                                </li>
                                <li class="center">
                                    <a href="#" id="pesquisa_material">Consultar Material</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li class="list-inline-item dropdown">
                        <div class="col-4">
                            <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">Ver Estoque</a>
                            <ul class="dropdown-menu">
                                <li class="center">
                                    <a href="./PesquisaCalcado">Ver Calçados</a>
                                </li>
                                <li class="center">
                                    <a href="./PesquisaMaterial">Consultar Material</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                </ul>
    </section>