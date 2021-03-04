package br.com.zup.manager.servlet;

import java.io.IOException;
import java.time.LocalDate;

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
		var fundation = req.getParameter("fundation");
		var enterprise = new Enterprise(name, LocalDate.parse(fundation));
		Data.save(enterprise);
		
		req.setAttribute("enterprises", Data.findAll());
		var rd = req.getRequestDispatcher("/list-enterprise.jsp");
		rd.forward(req, res);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("enterprises", Data.findAll());
		var rd = req.getRequestDispatcher("/list-enterprise.jsp");
		rd.forward(req, res);
	}

}
