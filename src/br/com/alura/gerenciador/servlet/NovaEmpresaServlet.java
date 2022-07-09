package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Cadastrando nova empresa");
		String nomeDaEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeDaEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//chamar o JSP, vamos dispachar a requisição para o JSP, e como se tivesse falando agora vai lá no 
		//JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		//agora falta falar pro dispachador "vai" para ele entregar essa requisição lá no JSP
		//no request vamos pendurar o nome da empresa para podermos pegar lá no servlet, utilizando Sting
		//empresa
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);//estamos entregando o request e response pro dispachador e podemos
		//usar esses recursos lá no JSP
		
	}

}
