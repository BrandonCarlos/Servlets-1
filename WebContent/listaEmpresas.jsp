<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>

	<ul>
	<!-- Estamos utilizando tag especial ForEach, más antes devemos importar o JSTL -->
		<c:forEach items="${empresas}" var="empresa"><!-- getAttribute("empresas") de forma automática -->
			<li>${empresa.nome}</li><!-- Por debaixo dos panos está chamando o empresa.getNome(), só que áqui é de forma mais
			simples -->
		</c:forEach>
	</ul>
	
</body>
</html>