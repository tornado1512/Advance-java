package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	String [] arr1={"Aman","jana","Mani"};
	String [] arr2={"virat","rohit","hardik"};
	ArrayList list=new ArrayList();
	list.add(arr1);
	list.add(arr2);
	request.setAttribute("arr",list);

	//request.getRequestDispatcher("next.jsp").forward(request,response);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}	
}