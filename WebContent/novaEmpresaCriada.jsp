<!-- O código abaixo é JSP, ele não aparece no navegador por que ele está sendo executado no lado do Servidor
por isso é Java Server Page = executado no servidor -->

<%
	String nomeEmpresa = "Alura";
	System.out.println(nomeEmpresa);
%>


<html>
	<body>
	<!-- Essa parte do scriptlet <%%> também será executada no lado do servidor -->
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
	</body>
</html>	

