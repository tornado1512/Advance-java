package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;
public class ActServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		Book book=new Book("ABc",1122,"abhi","java");
		request.setAttribute("abc",book);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}