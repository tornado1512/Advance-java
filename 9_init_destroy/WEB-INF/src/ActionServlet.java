import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ActionServlet extends HttpServlet
{
	public void init(){
		System.out.println("###################");
		System.out.println("###################");
		System.out.println("#####inside init()#######");
		System.out.println("###################");
		System.out.println("###################");
	}
	public void destroy(){
		System.out.println("###################");
		System.out.println("###################");
		System.out.println("#####inside destroy()#######");
		System.out.println("###################");
		System.out.println("###################");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		Date date= new Date();
		PrintWriter pw = response.getWriter();
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>Overiter if init() and Destroy ()</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>"+date +"</h1>");
		pw.write("</body>");I
		pw.write("</html>");
		pw.flush();
		pw.close();
	}
}