<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class=" container" id="fornecedores_cadastro">
            <div class="row">
                <div class="col-md-12">
                    <form action="./CadastrarFornecedores" method="post">
                        <legend>Cadastro de Fornecedores</legend>
                        <!-- <div class="form-group">
                            <div class="col-9">
                                <label for="codigo">Código</label>
                                <input type="text" class="form-control" name="campo_fornecedor_cod" readonly>
                                 
                            </div>
                        </div> -->
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
                            <select class="form-control" name="campo_fornecedor_estado" required>
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