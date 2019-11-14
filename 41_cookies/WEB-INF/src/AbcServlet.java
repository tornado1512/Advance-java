import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session= request.getSession();

		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();

		Cookie cookie1 = new Cookie("abc","123");
		Cookie cookie2 = new Cookie("mno","456");
		Cookie cookie3 = new Cookie("pqr","789");

		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);

		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>Cookies</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>Abc Servlet</h1>");
		pw.write("<a href='mno.do'>The link</a>");
		pw.write("</body>");
		pw.write("</html>");
		pw.flush();
		pw.close();
	}
}