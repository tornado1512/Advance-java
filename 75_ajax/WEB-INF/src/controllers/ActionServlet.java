package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.User;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String userName=request.getParameter("user_name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println(userName);
		System.out.println(email);
		System.out.println(password);
		User user=new User(userName,email,password);

		String resp="";
		if(user.saveUser()){
			resp="success";
		}
		else{
			resp="fail";
		}
		response.getWriter().write(resp);
	}
}