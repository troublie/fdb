<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Procurar PN</title>
	
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
		
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>

	<div id="wrapper">
		<div id= "header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Procurar PN</h3>

		<form:form action="searchProduto" modelAttribute="produto"  method="POST">
		
		 <!-- need to associate this data with customer id -->
		 
			<table>
				<tbody>
					<tr>
						<td><label>PN:</label> </td>
						<td><form:input path="partNumber"/></td>
					</tr>
					
					<tr>
						<td><label></label> </td>
						<td><input type="submit" value="Procurar" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
			


		</form:form>
		
		<div style="clear; both;"></div>
		
		<p>
		 	<a href="${pageContext.request.contextPath}/produto/">Voltar</a>
		</p>
		
	</div>

</body>

</html>