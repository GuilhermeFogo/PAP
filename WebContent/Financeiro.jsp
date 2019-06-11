<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <title>Financeiro</title>
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
                                    <a href="./Financeiro">
                                        <img src="img/logo_Sysangle.png" alt="AngleSys_logo" class="img=fluid  img-controle">
                                    </a>
                                </nav>
                            </li>
                            <li class="list-inline-item">
                                <div class="col-4">
                                    <a id="Fechar" class="btn btn-danger" href="./Financeiro" role="button">Voltar</a>
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
                                            <a href="#" id="solicitacao">Ver Solicitação Material</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
            </section>
		<section class="container" id="pesquisa_pedido">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Pesquisa Pedidos</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="codigo">Código do Pedido</label>
                                <input type="text" class="form-control" name="campo_pesquisa_pedido"
                                    placeholder="Digite o código da Venda">
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
		
		<section class="container" id="pesquisa_Cliente">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Pesquisar Cliente</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="nome">Nome do Cliente</label>
                                <input type="text" class="form-control" name="campo_pesquisa_nome_cliente"
                                    placeholder="Digite o nome da empresa">
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

        <section class="container" id="pesquisa_fornecedor">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Pesquisa Fornecedores</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="codigo">Código Fornecedor</label>
                                <input type="text" class="form-control" name="campo_pesquisa_codigo_fornecedor"
                                    placeholder="Digite o código do fornecedor">
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

        <section class="container" id="pesquisa_solicitacao">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Pesquisa Solicitação</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="codigo">Código da Solicitação de Compras</label>
                                <input type="text" class="form-control" name="campo_pesquisa_solicitacao_cod"
                                    placeholder="Digite o código da solicitação">
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

    <section class="container">
        <table class="table" id="tabela_tudo">
            <thead>
                <tr>
                    <th>Cliente</th>
                    <th>Produto</th>
                    <th>Preco</th>
                    <th>Status do pagamento</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td scope="row">XXXXX</td>
                    <td>Chinelo</td>
                    <td>500</td>
                    <td>pago</td>
                </tr>
                <tr>
                    <td scope="row">XXXXX</td>
                    <td>Sapato</td>
                    <td>120</td>
                    <td>n pago</td>
                </tr>
            </tbody>
        </table>
    </section>
    <main>
        

        <section class="container" id="cliente_cadastro">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Cadastro de Cliente</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="codigo">Código</label>
                            <input type="text" class="form-control" name="campo_cliente_cod" readonly>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Nome">Nome da Empresa</label>
                            <input type="text" class="form-control" name="campo_cliente_nome"
                                placeholder="Nome do Loja" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="preco">CNPJ</label>
                            <input type="number" class="form-control" name="campo_cliente_cnpj"
                                placeholder="CNPJ da Loja" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="logradouro">Logradouro</label>
                            <input type="text" class="form-control" name="campo_cliente_rua"
                                placeholder="Digite o Logradouro" required>
                             
                        </div>
                    </div>
					<div class="form-group">
                        <div class="col-9">
                            <label for="preco">Cidade</label>
                            <input type="text" class="form-control" name="campo_cliente_cidade"
                                placeholder="Digite a cidade" required>
                             
                        </div>
                    </div>
					<div class="form-group">
                        <div class="col-9">
                            <label for="Estilo">Estado</label>
                            <input type="text" class="form-control" name="campo_cliente_estado"
                                placeholder="Digite o estado" required>
                             
                        </div>
                    </div>
					<div class="form-group">
                        <div class="col-9">
                            <label for="Categoria">Cep</label>
                            <input type="number" class="form-control" name="campo_cliente_cep"
                                placeholder="Digite o CEP" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Telefone">Telefone</label>
                            <input type="tel" class="form-control" name="campo_cliente_telefone"
                                placeholder="Telefone da Loja" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Email">Email</label>
                            <input type="email" class="form-control" name="campo_cliente_email"
                                placeholder="Email da Loja" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Contato">Contato</label>
                            <input type="text" class="form-control" name="campo_cliente_contato"
                                placeholder="Nome do cliente" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <input name="campo_cadasto_cliente" class="btn btn-primary" type="submit" value="Cadastrar">
                        </div>
                    </div>
                    </form>
                </div>
            </div>
        </section>

        <section class=" container" id="fornecedores_cadastro">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Cadastro de Fornecedores</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="codigo">Código</label>
                                <input type="text" class="form-control" name="campo_fornecedor_cod" readonly>
                                 
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="nome">Nome da Empresa</label>
                                <input type="text" class="form-control" name="campo_fornecedor_nome"
                                    placeholder="Digite o nome da empresa" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="CNPJ">CNPJ da Fornecedor</label>
                                <input type="number" class="form-control" name="campo_fornecedor_cnpj"
                                    placeholder="Digite o CNPJ do fornecedor" required>
                            </div>
                        </div>   
                        <div class="form-group">
                            <div class="col-9">
                                <label for="email">Email do Fornecedor</label>
                                <input type="email" class="form-control" name="campo_fornecedor_email"
                                    placeholder="Digite o email do fornecedor" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Contato">Contato:</label>
                                <input type="text" class="form-control" name="campo_fornecedor_contato"
                                    placeholder="Digite o nome do fornecedor" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="telefone">Telefone:</label>
                                <input type="tel" class="form-control" name="campo_fornecedor_telefone"
                                    placeholder="Digite o telefone do fornecedor" required>
                            </div>
                        </div>
                        <div class="form-group">
                        <div class="col-9">
                            <label for="logradouro">Logradouro</label>
                            <input type="text" class="form-control" name="campo_fornecedor_rua"
                                placeholder="Digite o Logradouro" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="preco">Cidade</label>
                            <input type="text" class="form-control" name="campo_fornecedor_cidade"
                                placeholder="Digite a cidade" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Estilo">Estado</label>
                            <input type="text" class="form-control" name="campo_fornecedor_estado"
                                placeholder="Digite o estado" required>
                             
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Categoria">Cep</label>
                            <input type="number" class="form-control" name="campo_fornecedor_cep"
                                placeholder="Digite o CEP" required>
                             
                        </div>
                    </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input name="campo_cadasto_fornecedor" class="btn btn-primary" type="submit" value="Cadastrar">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>


		<section class="container" id="pedidos_cadastro">
			<div class="row">
				<div class="col-md-12">
					<form action="#" method="post">
						<legend>Cadastro de Pedidos</legend>
                        <div class="form-group">
							<div class="col-9">
								<label for="CNPJ">CNPJ da Loja</label>
								<input type="number" class="form-control" name="campo_pedido_cnpj_cliente"
									placeholder="Digite o CNPJ da loja" required>
							</div>
						</div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo">Código do produto</label>
                                <input type="number" class="form-control" name="campo_pedido_cod_produto"
                                    placeholder="Digite o código do produto" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Quantidade">Quantidade</label>
                                <input type="number" class="form-control" name="campo_pedido_quantidade"
                                    placeholder="Digite a quantidade do produto" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo">Forma de pagamento:</label>
                                <select class="form-control" name="campo_pedido_forma_pagamento">
                                    <option value="">Selecione o meio de pagamento</option>
                                    <option value="CartaoDebito">Cartão Débito</option>
                                    <option value="CartaoCredito">Cartão Crédito</option>
                                    <option value="Boleto">Boleto</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="preco">Preço:</label>
                                <input type="number" class="form-control" name="campo_pedido_preco"
                                    placeholder="Digite o preco do pedido" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="status">Status Pagamento</label>
                                <div class="form-check">
                                        <input class="form-check-input" type="radio" name="campo_pedido_status_pg" value="1">
                                        <label class="form-check-label" for="Pago"> Pago </label>
                                </div>
                            </div>
                            <div class="col-9">
                                <div class="form-check">
                                        <input class="form-check-input" type="radio" name="campo_pedido_status_pg" value="0">
                                        <label class="form-check-label" for="NPago"> Não Pago </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="data">Data pedido:</label>
                                <input name="campo_pedido_datas" class="form-control" type="date">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input class="btn btn-primary" type="submit" value="Cadastrar">
                            </div>
                        </div>
					</form>
				</div>
			</div>
		</section>
		
		<section class="container" id="cliente_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Remoção de Clientes</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo">Código Cliente</label>
                                <input type="text" class="form-control" name="campo_cliente_nome_del"
                                    placeholder="Digite o código do cliente">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-danger" value="Excluir">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
		
		<section class="container" id="pedido_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Remoção de Pedido</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo produto">Código do Pedido</label>
                                <input type="text" class="form-control" name="campo_pedido_del"
                                    placeholder="Digite o código do pedido">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-danger" value="Excluir">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>

        
	
        <section class=" container" id="fornecedor_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Remoção de Fornecedores</legend>
                        <div class="form-group">
                            <div class="col-9">
                                
                            </div>
                            <label for="codigo">Código do fornecedor</label>
                            <input type="text" class="form-control" name="campo_fornecedor_del"
                                    placeholder="Digite o código do fornecedor">
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-danger" value="Excluir">
                            </div>
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