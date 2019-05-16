<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>


<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">



</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark bg-primary ">
		<a class="navbar-brand" href="#">Agenda</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="index.html">Home </a></li>
				<li class="nav-item"><a class="btn btn-secondary "
					href="adiciona-contato.html">Cadastrar contato</a></li>

				<li class="nav-item"><a class="btn btn-secondary "
					href="busca-contato">Listar <span class="sr-only">(current)</span></a>
				</li>
			</ul>
		</div>
	</nav>

	<center>
		<h1>Lista de Contatos</h1>
	</center>
	<br>

	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nome:</th>
					<th scope="col">Email:</th>
					<th scope="col">Endereço:</th>
					<th scope="col">Telefone:</th>
					<th scope="col">Opções:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pessoa" items="${pessoas}">
					<tr>
						<td>${pessoa.id}</td>
						<td>${pessoa.nome}</td>
						<td>${pessoa.email}</td>
						<td>${pessoa.end}</td>
						<td>${pessoa.tel}</td>
						<td><a  href="remover-contato?id=${pessoa.id}">Remover</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<script src="js/bootstrap.js" type="text/javascript"></script>
</body>
</html>