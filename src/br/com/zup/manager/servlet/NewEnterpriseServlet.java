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
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		var name = req.getParameter("name");
		var enterprise = new Enterprise(name);
		Data.save(enterprise);
		
		req.setAttribute("enterprises", Data.findAll());
		var rd = req.getRequestDispatcher("/list-enterprise.jsp");
		rd.forward(req, res);
		//Data.findAll().forEach(e -> out.println("<li>" + e.getName() + "</li>"));
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("enterprises", Data.findAll());
		var rd = req.getRequestDispatcher("/list-enterprise.jsp");
		rd.forward(req, res);
	}

}
