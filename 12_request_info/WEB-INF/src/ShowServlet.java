import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ShowServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		pw.write("<h1>Header information using HttpServletRequest<h1>");
		pw.write("<h1> Application name : "+ request.getContextPath()+"</h1>");
		pw.write("<h1> Method is  : "+ request.getMethod()+"</h1>");
		pw.write("<h1> QUery String is  : "+ request.getQueryString()+"</h1>");
		pw.write("<h1> URI is  : "+ request.getRequestURI()+"</h1>");
		pw.write("<h1> URL is  : "+ request.getRequestURL()+"</h1>");
		pw.write("<h1> Servlet path is is  : "+ request.getServletPath()+"</h1>");






		pw.flush();
		pw.close();
		
	}
}
/*

Returns the Internet Protocol (IP) port number of the interface on which the request was receive
Returns the port number to which the request was sent.
*/