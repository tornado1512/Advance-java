import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		HttpSession session=request.getSession();
	
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<head>");
		pw.write("<title>abc page</title>");
		pw.write("<h1>abc page</h1>");
		pw.write("<a href='xyz.do'>The link</a>");
		pw.write("</head>");
		pw.write("</head>");
		pw.write("</html>");
	}
}