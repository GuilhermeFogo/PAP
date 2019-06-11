<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pesquisa_pedido">
            <div class="row">
                <div class="col-md-12">
                    <form action="./PesquisaPedido" method="post">
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