import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ActServlet extends HttpServlet
{
	public void  doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String manager="Anmol";
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		manager=getInitParameter("name");
		pw.write("<h1>"+manager+"</h1>");
		pw.flush();
		pw.close();
	}
}