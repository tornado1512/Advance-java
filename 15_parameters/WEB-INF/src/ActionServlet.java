import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;
public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		String s1=request.getParameter("food");
		String s2=request.getParameter("food");
		String s3=request.getParameter("food");

		String c1 = request.getParameter("ct");
		String c2 = request.getParameter("ct");
		String c3 = request.getParameter("ct");

		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		pw.write("<h1>Food1="+s1+"</h1>");
		pw.write("<h1>Food2="+s2+"</h1>");
		pw.write("<h1>Food3="+s3+"</h1>");
		pw.write("<h1>City1"+c1+"</h1>");
		pw.write("<h1>City2"+c2+"</h1>");
		pw.write("<h1>City3"+c3+"</h1>");

		pw.flush();
		pw.close();
	}
}