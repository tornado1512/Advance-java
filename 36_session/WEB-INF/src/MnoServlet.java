import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class MnoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session= request.getSession();

		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();

		pw.write("Mnoservlet--------------start");
		pw.write("</br>session Id:"+session.getId());
		pw.write("</br>session creation time:"+new Date(session.getCreationTime()));
		pw.write("</br>session LastAccessedTime:"+new Date(session.getLastAccessedTime()));
		pw.write("</br>is new:"+session.isNew());
		session.invalidate();
		pw.write("ovalid is call");
		pw.write("</br>session Id:"+session.getId());
		pw.write("</br>MaxInactiveInterval:"+session.getMaxInactiveInterval());
		pw.write("</br>Mno Servlet -------------end");
		pw.write("<a href='qrt.do'>The Link</a>");
		pw.flush();
		pw.close();

	}
}