import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		request.setAttribute("name","Mohan");
		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}