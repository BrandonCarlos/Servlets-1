package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//E aqui listamos as empresas
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//mudando o m�todo sobreescrito para "service" assim atende tanto GET quanto POST
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Aqui j� recebemos a empresa e a dataAbertura e vamos enviar empresas tamb�m l� para o JSP
		//meio que fomos coletando v�riaveis de servlets e por �ltimo enviar para o JSP, ai o JSP exibe essas
		//v�riaveis
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");//agora o servlet chama outro servlet
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
	}

}
