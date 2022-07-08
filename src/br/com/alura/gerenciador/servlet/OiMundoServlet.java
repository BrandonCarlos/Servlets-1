package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi") //com o WebServlet estamos declarando servlet OiMundoServlet se chama /oi
public class OiMundoServlet extends HttpServlet{//oiMundoServlet � um Servlet

	@Override //service abaixo � um m�todo da class HttpServlet que estamos sobreescrevendo
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();//este object � especializado para devolver caracteres, precisamos usar
		//esse object PrintWriter por que � do HttpServlet, out s� imprimi para o fluxo do navegador, e n�o no console
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, parabens vc escreveu o primeiro servlets.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OiMundoServlet foi chamado");//imprimir no console
	}
	
}
