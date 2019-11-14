package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String [] food=request.getParameterValues("food");
		if(food!=null){
			for(int i=0;i<food.length;i++){ 
				System.out.println(food[i]);
			}
		}
		//request.getRequestDispatcher("next.jsp").forward(request,response);
		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}	
}