import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class ActionServlet extends HttpServlet 
{	/*
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		Date date = new Date();
		PrintWriter pw=response.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<Title>Welcome</title>");
		pw.print("<body>");
		pw.print("<body>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>"+date+"</h1>");
		pw.print("</body>");
		pw.print("</html>");
		pw.flush();
		pw.close();
		*/
		protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		Date date = new Date();
		PrintWriter pw=response.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<Title>Welcome</title>");
		pw.print("<body>");
		pw.print("<body>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>"+date+"1*</h1>");
		pw.print("</body>");
		pw.print("</html>");
		*
		pw.flush();
		pw.close();
		*/
	}
}