import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;


public class ActServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		/*
		pw.write("<h1>Manager"+getInitParameter("manager")+"</h1>");
		pw.write("<h1>Sub-Manager"+getInitParameter("sub-manager")+"</h1>");
		pw.write("<h1>HR"+getInitParameter("hr")+"</h1>");
		*/
		Enumeration<String> em=getInitParameterNames();
		while(em.hasMoreElements()){
			pw.write("<h1>"+em.nextElement()+"</h1>");
		}
	}
}