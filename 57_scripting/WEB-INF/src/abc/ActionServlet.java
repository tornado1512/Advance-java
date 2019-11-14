package abc;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		Student s1=new Student("mohan",14,"GGITS");

		request.setAttribute("student",s1);

		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}