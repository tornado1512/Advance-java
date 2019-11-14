package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		Cookie cookie1=new Cookie("abc","123");
		Cookie cookie2=new Cookie("mno","456");

		response.addCookie(cookie1);
		response.addCookie(cookie2);
			
		request.getRequestDispatcher("next.jsp").forward(request,response);
		
	}	
}