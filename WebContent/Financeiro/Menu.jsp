<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container">
                <h2 class="financeiro"></h2>
                <ul class="list-inline">
                            <li class="list-inline-item dropdown">
                                <div class="col-4">
                                    <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false">Cadastar</a>
                                    <ul class="dropdown-menu">
                                        <li class="center">
                                            <a href="#" id="mostrar_cliente">Cadastro de Cliente</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="mostrar_pedidos"> Cadastar Pedidos</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="mostrar_fornecedor"> Cadastrar Fornecedor</a>
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
                                            <a href="#" id="remover_cliente">Remover Cliente</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="remove_pedido"> Remover Pedido</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="remove_fornecedor"> Remover Fornecedor</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="list-inline-item dropdown">
                                <div class="col-4">
                                    <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false">Pesquisar</a>
                                    <ul class="dropdown-menu">
                                        <li class="center">
                                            <a href="#" id="pesquisa_tudo">Ver Tudo</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="por_cliente">Por Cliente</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="por_pedido">Por Pedido</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="por_fornecedor">Por Fornecedor</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" id="solicitacao">Por Solicitação Material</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="list-inline-item dropdown">
                                <div class="col-4">
                                    <a class="btn btn-primary dropdown-toggle" href="#" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false">Visualizar</a>
                                    <ul class="dropdown-menu">
                                        <li class="center">
                                            <a href="#">Ver Tudo</a>
                                        </li>
                                        <li class="center">
                                            <a href="./PesquisaCliente">Ver Cliente</a>
                                        </li>
                                        <li class="center">
                                            <a href="./PesquisaPedido" id="por_pedido">Ver Pedido</a>
                                        </li>
                                        <li class="center">
                                            <a href="./PesquisaFornecedor">Ver Fornecedor</a>
                                        </li>
                                        <li class="center">
                                            <a href="#" >Ver Solicitação Material</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
            </section>