package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Cadastrando nova empresa");
		String nomeDaEmpresa = request.getParameter("nome");
		String  paramDataEmpresa = request.getParameter("data");//getParameter só pega dados String
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//object que sabe formatar/parsear
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);//customizando a exception
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeDaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//chamar o JSP, vamos dispachar a requisição para o JSP, e como se tivesse falando agora vai lá no 
		//outro Servlet
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");//lá no servlet "listaEmpresasServlet.java"
		//manda as váriaveis empresa e dataAbertura
		request.setAttribute("empresa", empresa.getNome());
		request.setAttribute("dataAbertura", empresa.getDataAbertura());
		rd.forward(request, response);
	}

}
