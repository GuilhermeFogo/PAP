<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="producao_monatagem">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Montagem</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Meta">Meta</label>
                                <input type="number" class="form-control" name="campo_monatagem_meta"
                                    placeholder="Digite a meta" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Data">Data</label>
                                <input type="date" class="form-control" name="campo_monatagem_data" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="hidden" class="form-control" name="campo_monatagem_usuario" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-primary a" name="campo_monatagem_submit" value="Iniciar">
                                <a href="#" id="montagem" class="btn btn-primary aparece">Ver Progresso</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>