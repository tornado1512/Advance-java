package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;

public class ActServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	String nextPage="index.jsp";
	String uname=request.getParameter("uname");
	String email=request.getParameter("email");
	String passw=request.getParameter("passw");
	User user=new User(uname,email,passw);
	if(user.saveRecord()){
		nextPage="login.jsp";
	}
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}