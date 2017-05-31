<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Lista de Produtos</title>

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

			<!--  add new button: Add Produto -->


			<!--  add out html table here -->

			<table>
				<tr>
					<th>Part Number</th>
					<th>Part Name</th>
					<th>Tradução</th>
					<th>NCM</th>
					<th>Comentários</th>
				</tr>

				<!--  loop e printa produtos -->
				<c:forEach var="tempProd" items="${produtos}">

					<!--  constrói um update link com o ID -->
					<c:url var="updateLink" value="/produto/showFormForUpdateProduto">
						<c:param name="prodId" value="${tempProd.produtoId}" />
					</c:url>

					<c:url var="deleteLink" value="/produto/delete">
						<c:param name="prodId" value="${tempProd.produtoId}" />
					</c:url>


					<tr>
						<td>${tempProd.partNumber}</td>
						<td>${tempProd.partName}</td>
						<td>${tempProd.partNameTrad}</td>
						<td>${tempProd.ncm}</td>
						<td>${tempProd.anotacoes}</td>
						<td>
							<!--  exibe o link de update --> <a href="${updateLink}">Atualizar</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>