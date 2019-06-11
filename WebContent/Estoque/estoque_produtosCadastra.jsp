<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="produtos_cadastra">
            <div class="row">
                <div class="col-md-12">
                    <form action="./CadastroCalcados" method="post">
                        <legend> Cadastro de Calçados</legend>
                        <!-- <div class="form-group">
                            <div class="col-9">
                                <label for="cod">Código</label>
                                <input type="number" class="form-control" name="campo_produto_cod" readonly>
                            </div>
                        </div> -->
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
                                    <option value="1">Esporte</option>
                                    <option value="2">Social</option>
                                    <option value="3">Casual</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Categoria">Gênero</label>

                                <select name="campo_produto_genero" class="form-control">
                                    <option value="">Selecione um gênero</option>
                                    <option value="1">Infantil</option>
                                    <option value="2">Adulto</option>
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