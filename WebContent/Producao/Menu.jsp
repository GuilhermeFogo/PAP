<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container">
            <h2 class="producao"></h2>
                <ul class="list-inline">
                    <!-- <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostar_costura">Costura</a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostar_montagem">Montagem</a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostra_pacote">Empacotamento</a>
                    </li>-->
                    
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostar_costura">Relatorio Producao</a>
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
                                    <a href="./PesquisaCalcadosProducao">Ver Calçados</a>
                                </li>
                                <li class="center">
                                    <a href="./PesquisaMaterialProducao">Consultar Material</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    
                </ul>
                <!-- <div class="progress some" style="height: 40px;">
                    <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%</div>
                </div>-->
        </section>