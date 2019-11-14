import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class QrtServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession session = request.getSession();
		
		
		System.out.println("QrtServlet---------------</br>");
		System.out.println("session id:"+session.getId());
		System.out.println("Creation Time:"+new Date(session.getCreationTime()));
		System.out.println("Last access Time:"+new Date(session.getLastAccessedTime()));
		
		System.out.println("Max Active time"+session.getMaxInactiveInterval());
		System.out.println("QrtServlet END<<<<<<<<<<");
		request.getRequestDispatcher("mohan.html").forward(request,response);

		
		
	}
}