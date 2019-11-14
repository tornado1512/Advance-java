import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException , ServletException{
		
		String host = request.getHeader("host");
		String ua = request.getHeader("user-agent");
		String acpt = request.getHeader("accept");
		String acptlang = request.getHeader("accept-language");
		String acptencd = request.getHeader("accept-encoding");
		String acptchrst = request.getHeader("accept-charset");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.write("<h1>Host is::"+host +"</h1>");
		pw.write("<h1>user-agent is:"+ua +"</h1>");
		pw.write("<h1>accept is::"+acpt +"</h1>");
		pw.write("<h1>accept-language is::"+acptlang +"</h1>");
		pw.write("<h1>accept-encoding is::"+acptencd +"</h1>");
		pw.write("<h1>accept-charset is::"+acptchrst +"</h1>");

		pw.flush();
		pw.close();

	}
}