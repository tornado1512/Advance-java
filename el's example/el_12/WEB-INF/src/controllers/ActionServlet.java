package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;


public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		Map map=new HashMap();

		map.put("abc#123","Mohan");
		map.put("abc#124",123);
		
		request.setAttribute("mno",map);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}	
}