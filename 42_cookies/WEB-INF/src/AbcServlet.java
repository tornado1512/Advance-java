import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		HttpSession session= request.getSession();
			Enumeration <String> enm = request.getParameterNames();
			while(enm.hasMoreElements
				()){
				String paramName=enm.nextElement();
				Cookie cookie=new Cookie(paramName,request.getParameter(paramName));
				response.addCookie(cookie);
			}


		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>form getting</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>Registration done</h1>");
		pw.write("<h1>Click here for second form submission</h1>");
		pw.write("<a href='mno.do'>here</a>");
		pw.write("</form>"); 
		pw.write("</body>");
		pw.write("</html>");
		pw.flush();
		pw.close();
	}
}