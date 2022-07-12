<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/><!-- Irá redirecionar p/ está url que é outra JSP que será a JSP de alterar dados -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preencha os dados</title>
</head>
<body>

<!-- Quando enviar os dados, manda os dados para o servlet /gerenciador, e no servlet eu capturo esses dados -->
	<form action="${linkServletNovaEmpresa}" method="POST">
		Nome: <input type="text" name="nome" placeholder="Digite o nome" value="${empresa.nome}"/>
		Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
		<input type="hidden" name="id" value="${empresa.id}"/><!-- Agora lá no servlet /alteraEmpresa, estamos enviando o ID -->
		<input type="submit"/>		
	</form>
</body>
</html>