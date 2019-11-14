import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session = request.getSession();
		ServletContext context=getServletContext();
		session.setAttribute("name","mohan");
		context.setAttribute("name","sohan");
		request.setAttribute("name","rohan");
		System.out.println("AAAServlet~~~~~~~~~~~~~~");

		request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}