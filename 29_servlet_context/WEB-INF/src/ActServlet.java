import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.write("<h1>manager at context-level"+getServletContext().getInitParameter("manager")+"</h1>");
		pw.write("<h1>manager at config-level"+getInitParameter("manager")+"</h1>");
	}
}