<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pesquisa_modelo">
        <div class="row">
            <div class="col-md-12">
                <form action="./PesquisaModelo" method="post">
                    <legend>Pesquisa Modelo</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Modelo">Modelo</label>
                            <select class="form-control" name="campo_pesquisa_modelo">
                                <option value="">Selecione um modelo</option>
                                <option value="Chinelo">Chinelo</option>
                                <option value="Sandalia">Sandalia</option>
                                <option value="Sapatilha">Sapatilha</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-9">
                        <input type="submit" class="btn btn-primary" value="Pesquisar">
                    </div>
                </form>
            </div>
        </div>
    </section>