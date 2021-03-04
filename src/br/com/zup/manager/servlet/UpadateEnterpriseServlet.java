package br.com.zup.manager.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/UpdateEnterprise")
public class UpadateEnterpriseServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		var id = Long.valueOf((String) req.getParameter("id"));
		var name = req.getParameter("name");
		var fundation = LocalDate.parse(req.getParameter("fundation"));
		var enterp = new Enterprise(name, fundation);
		Data.update(id, enterp);
		res.sendRedirect("list-enterprises");
	}
	
}
