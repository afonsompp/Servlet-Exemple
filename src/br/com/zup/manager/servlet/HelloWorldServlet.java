package br.com.zup.manager.servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Endpoint utilizado para fazer as requisições
@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		var out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Hello World");
		out.println("</body>");
		out.println("</html>");

	}

}
