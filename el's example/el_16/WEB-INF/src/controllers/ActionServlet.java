package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	
	ArrayList<String> arr=new ArrayList<String>();

	arr.add("Rave");
	arr.add("Ajay");
	arr.add("Kapil");
	arr.add("Daved");
	request.setAttribute("arr",arr);

	//request.getRequestDispatcher("next.jsp").forward(request,response);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}	
}