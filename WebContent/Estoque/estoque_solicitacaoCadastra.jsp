<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="solicitacao_coisa_cadastra">
            <div class="row">
                <div class="col-md-12">
                    <form action="./CadastroSolicitacao" method="post">
                        <legend>Solicitação de Compras</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="cod">Nome material</label>
                                <input type="text" class="form-control" name="campo_solicitacao_objeto"
                                    placeholder="Nome do material" required>
                            </div>
                            <div class="col-9">
                                <label for="Quantidade">Quantidade</label>
                                <input type="number" class="form-control" name="campo_solicitacao_quantidade"
                                    placeholder="Quantidade" required>
                            </div>
                            <div class="col-9">
                                <label for="descrição">Descrição</label>
                                <textarea type="text" class="form-control" name="campo_solicitacao_descricao"
                                    placeholder="Descrição da solicitação" required></textarea>
                            </div>
                        </div>
                        <div class="col-9">
                                <label for="Data fabricado">Data da solicitação</label>
                                <input type="date" class="form-control" name="campo_solicitacao_data" required>
                            </div>
                            <br>
                        <div class="col-9">
                            <input class="btn btn-primary" type="submit" value="Enviar">
                        </div>
                    </form>
                </div>
            </div>
        </section>