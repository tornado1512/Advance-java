import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CCCServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		ServletContext context=getServletContext();
		String name=(String)context.getAttribute("name");
		System.out.println("CCCServlet~~~~~~");
		System.out.println("attribute name is:"+name);
		request.getRequestDispatcher("ccc.html").forward(request,response);
		
		
	}
}