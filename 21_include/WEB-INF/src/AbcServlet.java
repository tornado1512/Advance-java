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
		PrintWriter pw= response.getWriter();
		pw.write("<h1>AbcServlet-----------------start</h1>");
		System.out.println("AbcServlet---------------start");
		RequestDispatcher view = request.getRequestDispatcher("cmn.do");
		view.include(request,response);
		pw.write("<h1>AbcServlet-----------------end</h1>");
		System.out.println("AbcServlet---------------end");
		pw.flush();
		pw. close();

	}
}
