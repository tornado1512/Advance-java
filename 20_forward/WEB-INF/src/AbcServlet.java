import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Abcservlet----------start</h1>");
		System.out.println("AbcServletStart---------->>>>>>>>>");
		RequestDispatcher view= request.getRequestDispatcher("cmn.do");
		view.forward(request,response);
		pw.write("<h1>Abcservlet----------end</h1>");
		System.out.println("AbcServletend----------<<<<<<<<<<");


	}
}