<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="produtos_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="./DeleteCalcados" method="post">
                        <legend>Remo��o de Cal�ado</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo produto">C�digo</label>
                                <input type="text" class="form-control" name="campo_produto_codigo_del"
                                    placeholder="Digite o c�digo do produdo">
                            </div>
                        </div>
                        <div class="col-9">
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </div>
                    </form>
                </div>
            </div>
        </section>