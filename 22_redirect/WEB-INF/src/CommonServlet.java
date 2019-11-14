import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class CommonServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.write("<h1>Coomon servlet page</h1>");
		pw.flush();
		pw.close();

	}
}