<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<section class="container" id="producao_costura">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Relatorio</legend>
                         <div class="form-group">
                            <div class="col-9">
                                <label for="Quantidade">Quantidade</label>
                                <input type="number" class="form-control" name="campo_producao"
                                    placeholder="Digite a quantidade" required>
                            </div>
                        </div> 
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Data">Data</label>
                                <input type="date" class="form-control" name="campo_data" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-primary a"  value="Ver">
                                <!-- <a href="#" id="costura" class="btn btn-primary aparece">Ver Progresso</a> -->
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>