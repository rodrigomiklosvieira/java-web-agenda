<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Adiciona contato</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"	rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary" >
  <a class="navbar-brand" href="#">Agenda</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.html">Home</a>
      </li>
      <li class="nav-item">
        <a class="btn btn-secondary" href="adiciona-contato.html">Cadastrar contato<span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item">
      <a class="btn btn-secondary " href="busca-contato">Listar</a>
      </li>
    </ul>
  </div>
</nav>

	<center><h1>Cadastre-se</h1></center>


	<section class="container ">
		<div class="card">
			<div class="card-body">
				<form action="cadastra-usuario" id="form-produto">
				
				<input type="hidden" id="id" name="id" value="${param.id}">
				
					<div class="form-row">
						<div class="form-group col-md-12">
							<label for="nome">Nome</label> 
							<input type="text"
								class="form-control" id="name" name="name" placeholder="Nome"
								required="on" value="${param.nome}">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-3">
							<label for="tel">Telefone</label> 
							
							<input data-mask="(99)9999-9999" class="form-control" id="tel" name="tel" placeholder="Telefone" value="${param.tel}">
						</div>

						<div class="form-group col-md-3">
							<label for="email">E-mail</label> 
							
							<input type="email" class="form-control" id="email" name="email" placeholder="E-mail" value="${param.email}">
						</div>

						<div class="form-group col-md-6">
							<label for="end">Endereço</label> 
							
							<input type="text" class="form-control" id="end" name="end" placeholder="Endereço" value="${param.end}">
						</div>

						<div class="form-group col-md-6">
							<button class="btn btn-success" id="btnSalvar" type="submit">Salvar</button>
						</div>
						<div class="form-group col-md-6">
							<a class="btn btn-primary" href="index.html"  >Voltar</a>
						</div>
						
						

					</div>
					
					
					
					</form>
			</div>
			
			</div>

		</section>
		
		
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
<script src="js/inputMask.js"></script>
</body>
</html>