import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;
public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		String [] s1=request.getParameterValues("food");
		
		String [] c1 = request.getParameterValues("ct");
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		for(String food:s1){
			int i=1;
			pw.write("<h1>Food"+i+"is"+food+"</h1>");
		}
		for(String city:c1){
			int i=1;
			pw.write("<h1>City "+i+"is"+city+"</h1>");
		}

		pw.flush();
		pw.close();
	}
}
<!--use getParamaeterValues this will retrun array of objects -->
