<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="cliente_cadastro">
            <div class="row">
                <div class="col-md-12">
                    <form action="./CadastarCliente" method="post">
                        <legend>Cadastro de Cliente</legend>
                    <!-- <div class="form-group">
                        <div class="col-9">
                            <label for="codigo">C�digo</label>
                            <input type="text" class="form-control" name="campo_cliente_cod" readonly>
                             
                        </div>
                    </div> -->
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
                            <select class="form-control" name="campo_cliente_estado" required>
                            	<option value=" ">Selecione um</option>
                            	<option value="1">AC</option>
                            	<option value="2">AL</option>
                            	<option value="3">AP</option>
                            	<option value="4">AM</option>
                            	<option value="5">BA</option>
                            	<option value="6">CE</option>
                            	<option value="7">DF</option>
                            	<option value="8">ES</option>
                            	<option value="9">GO</option>
                            	<option value="10">MA</option>
                            	<option value="11">MT</option>
                            	<option value="12">MS</option>
                            	<option value="13">MG</option>
                            	<option value="14">PA</option>
                            	<option value="15">PB</option>
                            	<option value="16">PR</option>
                            	<option value="17">PE</option>
                            	<option value="18">PI</option>
                            	<option value="19">RJ</option>
                            	<option value="20">RN</option>
                            	<option value="21">RS</option>
                            	<option value="22">RO</option>
                            	<option value="23">RR</option>
                            	<option value="24">SC</option>
                            	<option value="25">SP</option>
                            	<option value="26">SE</option>
                            	<option value="27">TO</option>
                            </select>
                             
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