<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body>
	
	<c:if test="${not empty empresa}">		
		<!-- ${empresa} � o mesmo que fazer getAttribute("empresa") s� que bem mais simples e faz um c�digo limpo -->
		Empresa ${empresa} cadastrada com sucesso!<!-- pega o attribute("empresa") -->
	</c:if>
	
	<c:if test="${empty empresa}">
		Nenhuma empresa cadastrada!
	</c:if>
	</body>
</html>	

