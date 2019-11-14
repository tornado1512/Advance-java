import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
 
public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nm = request.getParameter("nm");
		String em = request.getParameter("em");
		String pass = request.getParameter("pw");
		String ct = request.getParameter("ct");
		String food = request.getParameter("food");
		String addrs = request.getParameter("addr");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();


		pw.write("<h1>name is:"+nm+"</h1>");
		pw.write("<h1>email is:"+em+"</h1>");
		pw.write("<h1>password  is:"+pass+"</h1>");
		pw.write("<h1>City is:"+ct+"</h1>");
		pw.write("<h1>Food  is:"+food+"</h1>");
		pw.write("<h1>Address is:"+addrs+"</h1>");
		
		pw.flush();
		pw.close();


			
	}
}