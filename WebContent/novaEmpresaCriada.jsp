<!-- O c�digo abaixo � JSP, ele n�o aparece no navegador por que ele est� sendo executado no lado do Servidor
por isso � Java Server Page = executado no servidor -->

<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>


<html>
	<body>
	<!-- Essa parte do scriptlet <%%> tamb�m ser� executada no lado do servidor -->
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
	</body>
</html>	

