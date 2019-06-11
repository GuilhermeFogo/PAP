<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="materias_cadastra">
            <div class="row">
                <div class="col-md-12">
                    <form action="./CadastroMateriais" method="post">
                        <legend> Cadastro de Materiais (Mat�ria Prima)</legend>
                        <!-- <div class="form-group">
                            <div class="col-9">
                                <label for="cod">C�digo</label>
                                <input type="number" class="form-control" name="campo_material_cod" readonly>
                            </div>
                        </div> -->
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Nome material">Nome do material</label>
                                <input type="text" class="form-control" name="campo_material_nome"
                                    placeholder="Descri��o resumida do material" required>
                            </div>
                            <!--<div class="col-9">
                                <label for="Fornecedores"> C�digo Fornecedores</label>
                                <input type="text" class="form-control" name="campo_material_fornecedor"
                                    placeholder="C�digo Fornecedores" required>
                            </div> -->
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
                                <label for="descri��o">Descri��o</label>
                                <textarea type="text" class="form-control" name="campo_material_descricao"
                                    placeholder="Descri��o completa do material" required></textarea>
                            </div>
                        </div>
                        <div class="col-9">
                            <input name="campo_cadasto_material" class="btn btn-primary" type="submit" value="Cadastro">
                        </div>
                    </form>
                </div>
            </div>
        </section>