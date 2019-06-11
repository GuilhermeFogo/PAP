<%@page import="java.lang.String"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<title>Login</title>
	<meta charset="utf-8">
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Boostrap4 -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap-4.3.1-dist/css/bootstrap.css">
	
	<!-- Font-Awesome -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

	<!-- JavaScript Bootstrap -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script type="text/javascript" src="css/bootstrap-4.3.1-dist/js/bootstrap.js"></script>
	<!-- Personalizacao -->
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	
</head>
<body class="bg-amarelo">
	<header class="container-fluid">
		<div class="row bg-black">
			<div class="col-md-12">
				<ul class="list-inline">
					<li class="list-inline-item"> 
						<nav class="navbar navbar-brand">
							<a href="./Login">
								<img src="img/logo_Sysangle.png" alt="AngleSys_logo" class="img=fluid  img-controle">
							</a>
						</nav>
					</li>
				</ul>
			</div>
		</div>
	</header>
	<br> 
	<main class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-7">
				<form action="./Login" method="post" autocomplete="off">
					<legend>Login</legend>
					<div class="col-7">
						<label>Nome:</label>
						<input type="text" name="campo_usu" class="form-control" placeholder="Digite seu Nome de usuario" required="on">
					</div>
					<div class="col-7">
						<label>Senha:</label>
						<input type="password" name="campo_senha" class="form-control" placeholder="Digite sua Senha" required="on">
					</div>
					<div class="col-7">
						<input type="hidden" name="campo_perfil">
					</div>
					<div class="col-7">
						<br>
						<input type="submit" name="submit" class="btn btn-md btn-primary" value="Entrar">
					</div>
				</form>
			</div>
		</div>
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