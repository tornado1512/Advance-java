package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class SendRedirectServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		//case1
		//RequestDispatcher view= request.getRequestDispatcher("xyz/resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("/resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("/xyz/resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("../resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("../../resp.htzml");

		//view.forward(request,response);

		//case2
		//response.sendRedirect("abc/xyz/resp.html");
		//response.sendRedirect("xyz/resp.html");
		//response.sendRedirect("/xyz/resp.html");
		//response.sendRedirect("http://www.google.com");
		response.sendRedirect("http://localhost:8080/myapp");
	}
}