import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class CommonServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	
	PrintWriter pw = response.getWriter();
		

		pw.write("<h1> Commonservlet----------start</h1>");
		System.out.println("CoomonServletStart---------->>>>>>>>>");
		pw.write("<h1>Commonservlet----------End</h1>");
		System.out.println("CoomonServletEnd----------<<<<<<<<<<<<<");
		pw.flush();
		pw.close();
		System.out.println("rest code of coomon servlet after flush code>>>>>>>>>>>>>>");
	}
}