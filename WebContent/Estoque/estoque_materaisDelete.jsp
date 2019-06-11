<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="materiais_delete">
            <div class="row">
                <div class="col-md-12">
                    <form action="./DeleteMaterial" method="post">
                        <legend>Remoção de Materiais</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Codigo produto">Código do material</label>
                                <input type="text" class="form-control" name="campo_material_codigo_del"
                                    placeholder="Digite o código do material">
                            </div>
                        </div>
                        <div class="col-9">
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </div>
                    </form>
                </div>
            </div>
        </section>