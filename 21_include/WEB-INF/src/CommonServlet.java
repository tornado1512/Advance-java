import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
public class CommonServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		PrintWriter pw= response.getWriter();
		pw.write("<h1>CommonServlet-----------------start</h1>");
		System.out.println("CommonServlet---------------start");
		pw.write("<h1>CommonServlet-----------------end</h1>");
		System.out.println("CommonServlet---------------end");
	 
	}
}
