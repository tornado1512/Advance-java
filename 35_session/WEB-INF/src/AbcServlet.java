import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		HttpSession session=request.getSession();
		System.out.println("AbcServlet----------------------");
		System.out.println(session.getId());
		String url=response.encodeURL("mno.do");

		response.setContentType("text/html");
		PrintWriter pw = response .getWriter();
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>cookie</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>Abc Servlet</h1>");
		pw.write("<a href='"+url+"'>The Link</a>");
		pw.write("</body>");
		pw.write("</html>");
		pw.flush();
		pw.close();

	}
}