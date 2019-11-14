package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.User;
public class SaveServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String passw=request.getParameter("passw");
		System.out.println(uname);
		System.out.println(email);
		System.out.println(passw);
		User us=new User();
		us.setUserName(uname);
		us.setEmail(email);
		us.setPassword(passw);
		us.saveRecord();
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}