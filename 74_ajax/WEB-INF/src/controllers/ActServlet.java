package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ActServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("##################");

		try{
			response.getWriter().write("chandrayan-2");
		}
		catch ( Exception e){
			e.printStackTrace();
		}
		System.out.println("################");
	}
}