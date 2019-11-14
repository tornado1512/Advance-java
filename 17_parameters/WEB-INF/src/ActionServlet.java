import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;
public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
		
	 	/*	
		String [] s1=request.getParameterValues("food");
		
		String [] c1 = request.getParameterValues("ct");
		*/
	
		
		/*
		for(String food:s1){
			int i=1;
			pw.write("<h1>Food"+i+"is"+food+"</h1>");
		}
		for(String city:c1){
			int i=1;
			pw.write("<h1>City "+i+"is"+city+"</h1>");
		}
		*/
		String s1 = request.getParameter("nm");
		String s2 = request.getParameter("food");
		String s3 = request.getParameter("city");
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		pw.write("<h1>"+s1+"</h1>");
		pw.write("<h1>"+s2+"</h1>");
		pw.write("<h1>"+s3+"</h1>");

		pw.flush();
		pw.close();
	}
}

