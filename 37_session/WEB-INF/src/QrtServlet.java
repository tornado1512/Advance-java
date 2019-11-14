import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class QrtServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session= request.getSession(false);

		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();

		pw.write("Qrtservlet--------------start");
		pw.write("</br>session Id:"+session.getId());
		pw.write("</br>session creation time:"+new Date(session.getCreationTime()));
		pw.write("</br>session LastAccessedTime:"+new Date(session.getLastAccessedTime()));
		pw.write("</br>is new:"+session.isNew());
		pw.write("</br>MaxInactiveInterval:"+session.getMaxInactiveInterval());
		pw.write("</br>Qrt Servlet -------------end");
		pw.flush();
		pw.close();

	}
}