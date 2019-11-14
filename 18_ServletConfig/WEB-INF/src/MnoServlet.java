import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.*;
import java.io.IOException;
public class MnoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ServletConfig sc=getServletConfig();//here grtServletConfig will runs in the same context is of conaitner hence object f actionServlet
		System.out.println(sc);


	}
}