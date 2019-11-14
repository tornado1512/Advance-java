package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import models.User;
import java.io.*;
public class ShowServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ArrayList<User> users=User.collectUsers();
		request.setAttribute("users",users);
		request.getRequestDispatcher("record.jsp").forward(request,response);
	}
}