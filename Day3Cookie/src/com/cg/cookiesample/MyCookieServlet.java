package com.cg.cookiesample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyCookieServlet")
public class MyCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String user = request.getParameter("uname");
		 String email=request.getParameter("email");
		Cookie c1= new Cookie("user",user);
		Cookie c2 = new Cookie("email",email);
		response.addCookie(c1);
		response.addCookie(c2);
		 RequestDispatcher rd= request.getRequestDispatcher("NewCookieServlet");
		 rd.forward(request, response);
		 
		 
	}

}
