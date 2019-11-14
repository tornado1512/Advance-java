package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ScopeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();

		request.setAttribute("abc",true);

		session.setAttribute("abc",true);

		getServletContext().setAttribute("abc",true);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}