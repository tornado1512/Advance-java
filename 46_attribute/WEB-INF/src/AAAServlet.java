import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ServletContext context=getServletContext();
		System.out.println("AAAServlet~~~~~~~~");
			
		String name=request.getParameter("name");
		context.setAttribute("name",name);

		//case1
		//context.setAttribute("name","mohan");
		request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}