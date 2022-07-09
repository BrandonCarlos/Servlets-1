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

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");//motoboy se prepara e
		//vai colocando a localidade para listaEmpresas.jsp pois � l� que ele ir� fazer a entrega da "LISTA"
		request.setAttribute("empresas", lista);//apelido ser� "lista" e estou mandando a lista de empresas p/ o JSP percorrer
		rd.forward(request, response);
	}

}
