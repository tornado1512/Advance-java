import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		//case1
		//response.sendRedirect("cmn.do");	

		//case2
		//response.sendRedirect("http://localhost:9090/xyz/index.html");
		
		//case3
		response.sendRedirect("http://localhost:8080/myapp");//different server
		
		//case4
		//response.sendRedirect("http://www.google.com");
	}
}