<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pedidos_cadastro">
			<div class="row">
				<div class="col-md-12">
					<form action="./CadastroPedidos" method="post">
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
                                <label for="Codigo">Modelo do produto</label>
                                <input type="number" class="form-control" name="campo_pedido_cod_produto"
                                    placeholder="Digite o modelo do produto" required>
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
                                    <option value="2">Cartão Débito</option>
                                    <option value="1">Cartão Crédito</option>
                                    <option value="3">Boleto</option>
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