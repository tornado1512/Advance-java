package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class AServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		request.setAttribute("abc",123);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}