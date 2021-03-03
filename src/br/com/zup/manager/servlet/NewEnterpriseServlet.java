package br.com.zup.manager.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewEnterpriseServlet
 */
@WebServlet("/enterprise")
public class NewEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		var out = res.getWriter();
		
		var name = req.getParameter("name");
		var enterprise = new Enterprise(name);
		Data.save(enterprise);
		out.println("<html><body><p>Empresas:</p><ul>");
		Data.findAll().forEach(e -> out.println("<li>" + e.getName() + "</li>"));
		out.println("</ul></body></html>");
	}
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			var out = resp.getWriter();
			out.println("<html><body><p>Empresas:</p><ul>");
			Data.findAll().forEach(e -> out.println("<li>" + "Id: " + e.getId() 
			+ " | Nome usual: "+ e.getName() + "</li>"));
			out.println("</ul></body></html>");
		}

}
