import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ReactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.write("<h1>"+getInitParameter("manager")+"</h1>");
	
	}
}