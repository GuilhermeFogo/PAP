<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="pesquisa_materiais">
        <div class="row">
            <div class="col-md-12">
                <form action="./PesquisaMaterial" method="post">
                    <legend>Pesquisa Material</legend>
                    <div class="form-group">
                        <div class="col-9">
                            <label for="Material">Nome Material</label>
                            <input type="text" class="form-control" name="campo_pesquisa_material"
                                placeholder="Digite o nome do Material">
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