package com.cg.day2servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter	out= response.getWriter();
	/*ServletContext context= getServletContext();

	    String user = (String) context.getAttribute("user");	
		out.print(user);
		String pass = (String) context.getAttribute("pass");	
		out.print(pass);
		String tele = (String) context.getAttribute("tele");	
		out.print(tele);
		String id = (String) context.getAttribute("id");	
		out.print(id);
	}*/
	String user=request.getParameter("name");
	out.print(user);
	

	}}
