<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pesquisa_categoria">
        <div class="row">
            <div class="col-md-12">
                <form action="./PesquisaGenero" method="post">
                    <legend>Pesquisa Gênero</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Categoria">Gênero</label>
                            <select class="form-control" name="campo_pesquisa_genero">
                                <option value="">Selecione uma Gênero</option>
                                <option value="Adulto">Adulto</option>
                                <option value="infantil">Infantil</option>
                            </select>
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