import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class ActionServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.print("<html>");
			pw.print("<head>");
			pw.print("<title>Servlet example</title>");
			pw.print("</head>");
			pw.print("<body>");
			pw.print("<h1>Welcome to Our Website</h1>");
			pw.print("</body>");
			pw.print("</html>");
			pw.flush();
			pw.close();
			
		}
}