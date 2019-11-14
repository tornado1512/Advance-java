package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ScopeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String [] str={"mohan","sohan","rohan","gohan","zohan"};

		request.setAttribute("str",str);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}