import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ReactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.write("<h1>ReactServlet<h1>");
		pw.write("<h1>Seesion id:"+session.getId()+"<h1>");
		pw.write("<h1>Session Object:"+session+"<h1>");
	}
}