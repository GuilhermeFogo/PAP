<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class=" container" id="fornecedor_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="./DeleteFornecedor" method="post">
                        <legend>Remo��o de Fornecedores</legend>
                        <div class="form-group">
                            <div class="col-9">
                                
                            </div>
                            <label for="codigo">C�digo do fornecedor</label>
                            <input type="text" class="form-control" name="campo_fornecedor_del"
                                    placeholder="Digite o c�digo do fornecedor">
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