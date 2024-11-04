<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.JavaBeans"%>
<%@page import="java.util.ArrayList"%>
<%
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Agenda de Clientes</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<main>
		<h1>Clientes</h1>
		<a href="novo.html" class="btn">Novo Cliente</a>

		<table id="tabela">
			<thead>
				<tr>
					<th>ID</th>
					<th>NOME</th>
					<th>FONE</th>
					<th>E-MAIL</th>
					<th>OPÇÕES</th>
				</tr>
			</thead>

			<tbody>
				<%
				for (int i = 0; i < lista.size(); i++) {
				%>
				<tr>
					<td><%=lista.get(i).getIdcon()%></td>
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getFone()%></td>
					<td><%=lista.get(i).getEmail()%></td>
					<td><a href="select?idcon=<%=lista.get(i).getIdcon()%>"
						class="btn">Editar</a> <a
						href="javascript: confirmar(<%=lista.get(i).getIdcon()%>)"
						id="btnDel" class="btn">Excluir</a></td>
				</tr>

				<%
				}
				%>

			</tbody>

		</table>
		<script src="scripts/confirmador.js"></script>
	</main>
</body>
</html>

