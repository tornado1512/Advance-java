import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;


public class ActionServlet extends HttpServlet
{
	protected void doGet (HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		System.out.println("Helloo_World..............");
	}
}