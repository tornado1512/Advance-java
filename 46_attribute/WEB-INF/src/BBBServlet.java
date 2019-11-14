import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		ServletContext context =getServletContext();
		String name=(String)context.getAttribute("name");
		System.out.println("BBBServlet~~~~~~~~");
		System.out.println("attribute name is:"+name);
		request.getRequestDispatcher("bbb.html").forward(request,response);

	}
}