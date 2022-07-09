<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>


<html>
<body>
	<h1>Lista de empresas: </h1><br/>
	<ul>
	<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");//converte de Objeto p/ List<Empresa>
		for(Empresa empresa: lista) {
	%>
		<li><%= empresa.getNome() %></li>
	<%
		}
	%>
	</ul>
</body>
</html>