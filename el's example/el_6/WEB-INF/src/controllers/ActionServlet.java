package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;
public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		User user = new User();

		user.setAge(16);
		user.setName("abhi");

		request.setAttribute("user",user);

		//request.getRequestDispatcher("next.jsp").forward(request,response);
		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}	
}