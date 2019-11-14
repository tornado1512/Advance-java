package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DownloadServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		InputStream is=getServletContext().getResourceAsStream("a1.pdf");
		ServletOutputStream sos=response.getOutputStream();
		byte[] b= new byte[50000];
		while(is.read(b)!=-1){
			sos.write(b);
			
		}
		sos.flush();
		sos.close();
	}
}