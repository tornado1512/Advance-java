import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MnoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session= request.getSession();

		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();

		
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>Cookies</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>Mno Servlet</h1>");
		Cookie [] cookies=request.getCookies();
		for(Cookie cookie:cookies){
			//pw.write("<h1>"+cookie+"</h1>");
			pw.write("<h1>"+cookie.getName()+"~"+cookie.getValue()+"</h1>");
			
		}
		pw.write("</body>");
		pw.write("</html>");
		pw.flush();
		pw.close();
	}
}