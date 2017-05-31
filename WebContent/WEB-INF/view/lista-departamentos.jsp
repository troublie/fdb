<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Lista de Departamentos</title>

<!-- reference our stylesheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>F teste</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!--  add new button: Add Customer -->

			<input type="button" value="Adicionar Novo"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button" />

			<!--  add out html table here -->

			<table>
				<tr>
					<th>Nome</th>
					<th></th>
				</tr>

				<!--  loop e printa departamentos -->
				<c:forEach var="tempDepto" items="${departamentos}">

					<!--  constrói um update link com o ID -->
					<c:url var="updateLink" value="/departamento/showFormForUpdate">
						<c:param name="deptoId" value="${tempDepto.deptoId}" />
					</c:url>

					<c:url var="deleteLink" value="/departamento/delete">
						<c:param name="deptoId" value="${tempDepto.deptoId}" />
					</c:url>


					<tr>
						<td>${tempDepto.nome}</td>
						<td>
							<!--  exibe o link de update --> <a href="${updateLink}">Atualizar</a>
							l <!-- exibe o link de delete --> <a href="${deleteLink}"
							onclick="if (!(confirm('Tem certeza que deseja deletar este registro?'))) return false">Deletar</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>