import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.io.IOException;

public class AbcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
		ServletConfig scnfg=getServletConfig();
		ServletContext scntxt=getServletContext();

		System.out.println("Abc----->ServletConfig"+scnfg);
		System.out.println("Abc----->ServletContext"+scntxt);
		System.out.println("Abc----->CurrentObject"+this);
	}
}