<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>
	
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
		
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-depto-style.css">
</head>

<body>

	<div id="wrapper">
		<div id= "header">
			<h2>F teste</h2>
		</div>
	</div>

	<div id="container">
		<h3>Adicionar departamento</h3>

		<form:form action="addDepto" modelAttribute="departamento" method="POST">
		
		 <!-- need to associate this data with customer id -->
		 <form:hidden path="deptoId" />
		 
			<table>
				<tbody>
					<tr>
						<td><label>Nome</label> </td>
						<td><form:input path="nome" /></td>
					</tr>
					
					<tr>
						<td><label></label> </td>
						<td><input type="submit" value="Salvar" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
			


		</form:form>
		
		<div style="clear; both;"></div>
		
		<p>
		 	<a href="${pageContext.request.contextPath}/departamento/list">Voltar para lista de departamentos</a>
		</p>
		
	</div>

</body>

</html>