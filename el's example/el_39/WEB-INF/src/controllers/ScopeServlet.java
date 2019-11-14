package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.User;
import java.util.*;
public class ScopeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		ArrayList<User> users=User.getRecords();
		session.setAttribute("users",users);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}