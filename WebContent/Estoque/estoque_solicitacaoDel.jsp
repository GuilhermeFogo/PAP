<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="solicitacao_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="/DeleteSolicitacao" method="post">
                        <legend>Remoção de Solicitção de Compras</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo">Codigo da solicitação</label>
                                <input type="text" class="form-control" name="campo_soliticacao_del"
                                    placeholder="Digite o codigo da solicitacao">
                            </div>
                        </div>
                        <div class="col-9">
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </div>
                    </form>
                </div>
            </div>
        </section>