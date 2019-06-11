<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pesquisa_Cliente">
            <div class="row">
                <div class="col-md-12">
                    <form action="./PesquisaCliente" method="post">
                        <legend>Pesquisar Cliente</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="nome">Nome do Cliente</label>
                                <input type="text" class="form-control" name="campo_pesquisa_nome_cliente"
                                    placeholder="Digite o nome da empresa">
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
    