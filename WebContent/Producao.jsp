<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><html lang="pt-br">
<html>
<head>
    <title>Producao</title>
    <meta charset="ISO-8859-1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Boostrap4 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Font-Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

    <!-- JavaScript Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

    <!-- Personalizacao -->
    <script src="js/MeuJquery.js"></script>
    <link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>

<body>
    <header class="container-fluid">
        <div class="row bg-black">
            <div class="col-md-12">
                <ul class="list-inline">
                    <li class="list-inline-item">
                        <nav class="navbar navbar-brand">
                            <a href="./Producao">
                                <img src="img/logo_Sysangle.png" alt="AngleSys_logo" class="img=fluid  img-controle">
                            </a>
                        </nav>
                    </li>
                    <li class="list-inline-item">
                        <div class="col-4">
                            <a id="Fechar" class="btn btn-danger" href="./Producao" role="button">Voltar</a>
                        </div>
                    </li>
                    <li class="list-inline-item">
                        <div class="col-4">
                            <a class="btn btn-danger" href="./Login" role="button">Sair</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </header>
    <main>
        <section class="container">
            <h2 class="producao"></h2>
                <ul class="list-inline">
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostar_costura">Costura</a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostar_montagem">Montagem</a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-md btn-primary" id="mostra_pacote">Empacotamento</a>
                    </li>
                </ul>
                <div class="progress some" style="height: 40px;">
                    <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%</div>
                </div>
        </section>


        <section class="container" id="producao_costura">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Costura</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Meta">Meta</label>
                                <input type="number" class="form-control" name="campo_costura_meta"
                                    placeholder="Digite a meta" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Data">Data</label>
                                <input type="date" class="form-control" name="campo_costura_data" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="hidden" class="form-control" name="campo_costura_usuario" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-9">
                                <input type="submit" class="btn btn-primary a" name="campo_costura_submit" value="Iniciar">
                                <a href="#" id="costura" class="btn btn-primary aparece">Ver Progresso</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>

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

        <section class="container" id="producao_empacotamento">
            <div class="row">
                <div class="col-md-12">
                    <form action="#" method="post">
                        <legend>Empacotamento</legend>
                        <div class="form-group">
                            <div class="col-9">
                                <label for="Meta">Meta</label>
                                <input type="number" class="form-control" name="campo_empacotamento_meta"
                                    placeholder="Digite a meta" required>
                            </div>
                        </div>
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
    </main>
    <footer class="container-fluid">
        <div class="row fixed-bottom">
            <div class="col-4"></div>
            <div class="col-4">
                <div class="center">
                    <p>Copyright &copy; Angle 2019</p>
                </div>
            </div>
        </div>
    </footer>
</body>

</html>