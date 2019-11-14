import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession session = request.getSession();
		System.out.println("AbcServlet---------------</br>");
		System.out.println("session id:"+session.getId());
		System.out.println(session.isNew());
		System.out.println("AbcServlet END<<<<<<<<<<");

		request.getRequestDispatcher("mno.html").forward(request,response);
	}
}