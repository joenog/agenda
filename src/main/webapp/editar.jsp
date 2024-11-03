<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Editar Clientes</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<main>
		<h1>Editar Cliente</h1>

		<form name="frmContato" action="update">
			<table>
				<tr>
					<td><input id="editarImput" name="idcon" readonly
						value="<%out.print(request.getAttribute("idcon"));%>"></td>
				</tr>
				<tr>
					<td><input type="text" name="nome"
						value="<%out.print(request.getAttribute("nome"));%>"></td>
				</tr>

				<tr>
					<td><input type="text" name="fone"
						value="<%out.print(request.getAttribute("fone"));%>"></td>
				</tr>

				<tr>
					<td><input type="text" name="email"
						value="<%out.print(request.getAttribute("email"));%>"></td>
				</tr>
			</table>
			<input type="button" value="Salvar" class="btn" onclick="validar()">
		</form>
	</main>

	<script src="scripts/validador.js"></script>
</body>
</html>