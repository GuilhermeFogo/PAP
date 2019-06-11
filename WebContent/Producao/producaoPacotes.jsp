<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <section class="container" id="producao_empacotamento">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Empacotamento</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Data">Data</label>
                                <input type="date" class="form-control" name="campo_empacotamento_data" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="hidden" class="form-control" name="campo_empacotamento_usuario" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-primary a" name="campo_empacotamento_submit" value="Iniciar">
                                <a href="#" id="pacote" class="btn btn-primary aparece">Ver Progresso</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>