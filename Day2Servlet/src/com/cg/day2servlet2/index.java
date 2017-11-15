package com.cg.day2servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//PrintWriter	out= response.getWriter();
	//Enumeration<String> param=request.getParameterNames();
	
	//while(param.hasMoreElements())
	//{
		//String par=(String)param.nextElement();
		//String value=request.getParameter(par);
		//out.print(par);
		//out.println(value);
	//}
	String user=request.getParameter("name");
	//String pass=request.getParameter("pwd");
	//String tele=request.getParameter("tel");
	//String id=request.getParameter("email");
	ServletContext context= getServletContext();
	context.setAttribute("user",user);
	//context.setAttribute("pass",pass);
	//context.setAttribute("tele",tele);
	//context.setAttribute("id",id);
	//RequestDispatcher rd= request.getRequestDispatcher("SecondServlet");
//	RequestDispatcher rd=getServletContext().getRequestDispatcher("/SecondServlet");
	response.sendRedirect("SecondServlet");
	//rd.forward(request,response);
	
	
	
	}

	
}
