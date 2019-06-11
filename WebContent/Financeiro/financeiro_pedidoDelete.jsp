<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pedido_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="./DeletePedido" method="post">
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