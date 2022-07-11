<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<body>
	<c:if test="${not empty empresa}">
		<!-- ${empresa} � o mesmo que fazer getAttribute("empresa") s� que bem mais simples e faz um c�digo limpo -->
		Empresa ${empresa} cadastrada com sucesso!<!-- pega o attribute("empresa") -->
	</c:if>

	<h1>Lista de empresas:</h1>

	<ul>
		<!-- Estamos utilizando tag especial ForEach, m�s antes devemos importar o JSTL -->
		<c:forEach items="${empresas}" var="empresa">
			<!-- getAttribute("empresas") de forma autom�tica -->

			<li>${empresa.nome}- <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /></li>
			<!-- Por debaixo dos panos est� chamando o empresa.getNome(), s� que �qui � de forma mais
			simples -->
		</c:forEach>
	</ul>

</body>
</html>