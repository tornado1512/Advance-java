package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	
	int [] a={11,12,13,14,15};
	request.setA("arr",a);

	//request.getRequestDispatcher("next.jsp").forward(request,response);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}	
}