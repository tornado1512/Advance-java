import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class XyzServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		

		PrintWriter pw = response.getWriter();
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<head>");
		pw.write("<title>abc page</title>");
		Cookie [] cookies=request.getCookies();
		for(Cookie cookie:cookies){
			pw.write("<h1>"+cookie.getName()+"~"+cookie.getValue()+"</h1>");
		}
		pw.write("<a href='xyz.do'>The link</a>");
		pw.write("</head>");
		pw.write("</head>");
		pw.write("</html>");
	}
}