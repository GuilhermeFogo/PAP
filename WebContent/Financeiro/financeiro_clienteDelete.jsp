<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="cliente_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="./DeleleCliente" method="post">
                        <legend>Remo��o de Clientes</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo">C�digo Cliente</label>
                                <input type="text" class="form-control" name="campo_cliente_nome_del"
                                    placeholder="Digite o c�digo do cliente">
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