package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import models.User;
import java.io.*;
public class SaveServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String passw=request.getParameter("passw");

		User us=new User();
		us.setUserName(uname);
		us.setEmail(email);
		us.setPassword(passw);
		
		us.saveRecord();
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}