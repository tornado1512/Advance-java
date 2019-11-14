import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session = request.getSession();
		ServletContext context=getServletContext();
		String str1=(String)session.getAttribute("name");
		String str2=(String)context.getAttribute("name");
		String str3=(String)request.getAttribute("name");
		System.out.println("BBBServlet~~~~~~~~~~~~~~~~~~~~");
		System.out.println("name(session~~~~)"+str1);
		System.out.println("name(context~~~~)"+str2);
		System.out.println("name(request~~~~)"+str3);
		session.invalidate();
		request.getRequestDispatcher("bbb.html").forward(request,response);
	}
}