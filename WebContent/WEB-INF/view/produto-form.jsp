<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Atualizar PN</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>F DB</h2>
		</div>
	</div>

	<div id="container">
		<h3>Atualizar PN</h3>

		<form:form action="saveProduto" modelAttribute="produto" method="POST">

			<!-- need to associate this data with produto id -->
			<form:hidden path="produtoId" />

			<table>
				<tbody>
					<tr>
						<td><label>PN:</label></td>
						<td><form:input path="partNumber" readonly="true" /></td>
					</tr>
					<tr>
						<td><label>Part Name:</label></td>
						<td><form:input path="partName"  readonly="true" /></td>
					</tr>
					<tr>
						<td><label>Tradução:</label></td>
						<td><form:input path="partNameTrad" /></td>
					</tr>

					<tr>
						<td><label>NCM:</label></td>
						<td><form:input path="ncm" /></td>
					</tr>

					<tr>
						<td><label>Comentários:</label></td>
						<td><form:input path="anotacoes" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Atualizar" class="save" /></td>
					</tr>

				</tbody>
			</table>



		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/produto/">Back to
				List</a>
		</p>

	</div>

</body>

</html>