<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="pt-br">

<head>
    <title>Estoque</title>
    <meta charset="ISO-8859-1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Boostrap4 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Font-Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

    <!-- JavaScript Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

    <!-- Personalizacao -->
    <script src="js/MeuJquery.js"></script>
    <link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>

<body>
    <header class="container-fluid">
        <div class="row bg-black">
            <div class="col-md-12">
                <ul class="list-inline">
                    <li class="list-inline-item">
                        <nav class="navbar navbar-brand">
                            <a href="./Estoque">
                                <img src="img/logo_Sysangle.png" alt="AngleSys_logo" class="img=fluid  img-controle">
                            </a>
                        </nav>
                    </li>
                    
                    <li class="list-inline-item">
                        <div class="col-4">
                            <a id="Fechar" class="btn btn-danger" href="./Estoque" role="button">Voltar</a>
                        </div>
                    </li>
                    <li class="list-inline-item">
                        <div class="col-4">
                            <a class="btn btn-danger" href="./Login" role="button">Sair</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </header>

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
                </ul>
    </section>
    <section class="container" id="pesquisa_materiais">
        <div class="row">
            <div class="col-md-12">
                <form action="#" method="post">
                    <legend>Pesquisa Material</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Material">Nome Material</label>
                            <input type="text" class="form-control" name="campo_pesquisa_material"
                                placeholder="Digite o nome do Material">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <input type="submit" class="btn btn-primary" value="Pesquisar">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>

    <section class="container" id="pesquisa_modelo">
        <div class="row">
            <div class="col-md-12">
                <form action="#" method="post">
                    <legend>Pesquisa Modelo</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Modelo">Modelo</label>
                            <select class="form-control" name="campo_pesquisa_modelo">
                                <option value="">Selecione um modelo</option>
                                <option value="Chinelo">Chinelo</option>
                                <option value="Sandalia">Sandalia</option>
                                <option value="Sapatilha">Sapatilha</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-9">
                        <input type="submit" class="btn btn-primary" value="Pesquisar">
                    </div>
                </form>
            </div>
        </div>
    </section>

    <section class="container" id="pesquisa_categoria">
        <div class="row">
            <div class="col-md-12">
                <form action="#" method="post">
                    <legend>Pesquisa Gênero</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Categoria">Gênero</label>
                            <select class="form-control" name="campo_pesquisa_genero">
                                <option value="">Selecione uma Gênero</option>
                                <option value="Adulto">Adulto</option>
                                <option value="infantil">Infantil</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <input type="submit" class="btn btn-primary" value="Pesquisar">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>
    <main>
        <section class="container">
        <div class="row">
            <div class="col-md-12">
                <table class="table" id="tabela_tudo">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Modelo</th>
                            <th>Genero</th>
                            <th>Quantidade</th>
                            <th>Data Entrada</th>
                            <th>Data Limite</th>
                        </tr>
                    </thead>
                    <tbody>
                            <tr>
                                <td scope="row">001</td>
                                <td>Chinelo R45</td>
                                <td>Feminino</td>
                                <td>1000 pares</td>
                                <td>03/02/2019</td>
                                <td>25/06/2019</td>
                            </tr>
                            <tr>
                                <td scope="row">001</td>
                                <td>Sandalia L45</td>
                                <td>Feminino</td>
                                <td>1000 pares</td>
                                <td>03/02/2019</td>
                                <td>25/06/2019</td>
                            </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </section>

    <section class="container" id="materias_cadastra">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend> Cadastro de Materiais (Matéria Prima)</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="cod">Código</label>
                                <input type="number" class="form-control" name="campo_material_cod" readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Nome material">Nome do material</label>
                                <input type="text" class="form-control" name="campo_material_nome"
                                    placeholder="Descrição resumida do material" required>
                            </div>
                            <div class="col-9">
                                <label for="Fornecedores"> Código Fornecedores</label>
                                <input type="text" class="form-control" name="campo_material_fornecedor"
                                    placeholder="Código Fornecedores" required>
                            </div>
                            <div class="col-9">
                                <label for="quantidade"> Quantidade</label>
                                <input type="number" class="form-control" name="campo_material_quantidade"
                                    placeholder="Quantidade de material" required>
                            </div>
                            <div class="col-9">
                                <label for="Unidade"> Unidade</label>
                                <select class="form-control" name="campo_material_unidade">
                                    <option value="Metro">Mt</option>
                                    <option value="quilo">Kg</option>
                                    <option value="litros">L</option>
                                    <option value="galao">Gl</option>
                                </select>
                            </div>
                            <div class="col-9">
                                <label for="quantidade"> Medida</label>
                                <input type="number" class="form-control" name="campo_material_medida"
                                    placeholder="Quantidade de material" required>
                            </div>
                            <div class="col-9">
                                <label for="descrição">Descrição</label>
                                <textarea type="text" class="form-control" name="campo_material_descricao"
                                    placeholder="Descrição completa do material" required></textarea>
                            </div>
                        </div>
                        <div class="col-9">
                            <input name="campo_cadasto_material" class="btn btn-primary" type="submit" value="Cadastro">
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <section class="container" id="produtos_cadastra">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend> Cadastro de Calçados</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="cod">Código</label>
                                <input type="number" class="form-control" name="campo_produto_cod" readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Nome">Modelo</label>
                                <input type="text" class="form-control" name="campo_produto_modelo"
                                    placeholder="Modelo do Produto" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Numero">Número</label>
                                <input type="number" class="form-control" name="campo_produto_numero"
                                    placeholder="Número do Calçado" required>
                            </div>
                        </div>
                        <div class="form-group">
                                 <div class="col-9">
                                <label for="Estilo">Estilo</label>
                                <select name="campo_produto_estilo" class="form-control">
                                    <option value="">Selecione um estilo</option>
                                    <option value="Social">Social</option>
                                    <option value="Esporte">Esporte</option>
                                    <option value="Casual">Casual</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Categoria">Gênero</label>

                                <select name="campo_produto_genero" class="form-control">
                                    <option value="">Selecione um gênero</option>
                                    <option value="Adulto">Adulto</option>
                                    <option value="Infantil">Infantil</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <div class="col-9">
                                    <label for="quantidade">Quantidade:</label>
                                    <input type="number" name="campo_produto_quantidade" 
                                    placeholder="Digite a quantidade" required class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                            <div class="col-9">
                                <label for="Cor">Cor</label>
                                <input type="color" class="form-control" name="campo_produto_cor" required>
                            </div>
                            <br>
                            <div class="col-9">
                                <input name="campo_cadasto_produto" class="btn btn-primary" type="submit" value="Cadastro">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>

        <section class="container" id="solicitacao_coisa_cadastra">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Solicitação de Compras</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="cod">Código de material</label>
                                <input type="text" class="form-control" name="campo_solicitacao_objeto"
                                    placeholder="Codigo do produto" required>
                            </div>
                            <div class="col-9">
                                <label for="Quantidade">Quantidade</label>
                                <input type="number" class="form-control" name="campo_solicitacao_quantidade"
                                    placeholder="Quantidade" required>
                            </div>
                            <div class="col-9">
                                <label for="descrição">Descrição</label>
                                <textarea type="text" class="form-control" name="campo_solicitacao_descricao"
                                    placeholder="Descrição da solicitação" required></textarea>
                            </div>
                        </div>
                        <div class="col-9">
                                <label for="Data fabricado">Data da solicitação</label>
                                <input type="date" class="form-control" name="campo_solicitacao_data" required>
                            </div>
                            <br>
                        <div class="col-9">
                            <input class="btn btn-primary" type="submit" value="Enviar">
                        </div>
                    </form>
                </div>
            </div>
        </section>

        <section class="container" id="produtos_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Remoção de Calçado</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo produto">Código</label>
                                <input type="text" class="form-control" name="campo_produto_codigo_del"
                                    placeholder="Digite o código do produdo">
                            </div>
                        </div>
                        <div class="col-9">
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </div>
                    </form>
                </div>
            </div>
        </section>

        <section class="container" id="solicitacao_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Remoção de Solicitção de Compras</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo">Codigo da solicitação</label>
                                <input type="text" class="form-control" name="campo_soliticacao_del"
                                    placeholder="Digite o codigo da solicitacao">
                            </div>
                        </div>
                        <div class="col-9">
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </div>
                    </form>
                </div>
            </div>
        </section>

        <section class="container" id="materiais_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Remoção de Materiais</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo produto">Código do material</label>
                                <input type="text" class="form-control" name="campo_material_codigo_del"
                                    placeholder="Digite o código do material">
                            </div>
                        </div>
                        <div class="col-9">
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </div>
                    </form>
                </div>
            </div>
        </section>

    </main>
    <footer class="container-fluid">
        <div class="row fixed-bottom">
            <div class="col-4"></div>
            <div class="col-4">
                <div class="center">
                    <p>Copyright &copy; Angle 2019</p>
                </div>
            </div>
        </div>
    </footer>
</body>

</html>