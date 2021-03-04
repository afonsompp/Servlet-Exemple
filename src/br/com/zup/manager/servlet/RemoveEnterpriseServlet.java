package br.com.zup.manager.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/RemoveEnterprise")
public class RemoveEnterpriseServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		var id = Long.valueOf((String) req.getParameter("id"));
		Data.delete(id);
		res.sendRedirect("list-enterprises");
	}
	
}
