<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preencha os dados</title>
</head>
<body>

<!-- Quando enviar os dados, manda os dados para o servlet /gerenciador, e no servlet eu capturo esses dados -->
	<form action="${linkServletNovaEmpresa}" method="POST">
		Nome: <input type="text" name="nome"/>
		<input type="submit"/>		
	</form>
</body>
</html>