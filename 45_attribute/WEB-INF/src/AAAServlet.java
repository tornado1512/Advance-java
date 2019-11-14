import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		System.out.println("AAAServlet~~~~~~~~");
			
		String name=request.getParameter("name");
		session.setAttribute("name",name);

		//case1
		//session.setAttribute("name","mohan");
		request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}