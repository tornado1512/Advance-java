import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class MnoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		HttpSession session= request.getSession();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>form getting</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<form>");
		Cookie [] cookies = request.getCookies();
		for(Cookie cookie:cookies){
		String ckNm = cookie.getName();
		if(ckNm.equals("uname")){
		pw.write("User Name<input type='text' name='nm' value='"+cookie.getValue()+"'></br>");
		}
		else if(ckNm.equals("email")){
		pw.write("Email<input type='em' name='em' value='"+cookie.getValue()+"'></br>");
		}
		else if(ckNm.equals("pswrd")){
		pw.write("Password<input type='password' name='pw' value='"+cookie.getValue()+"'></br>");
		}
		else if(ckNm.equals("mobno")){
		pw.write("Mobile no<input type='text' name='mn' value='"+cookie.getValue()+"'></br>");
		}
		}
		pw.write("<input type='submit' value='register'>");
		pw.write("</form>"); 
		pw.write("</body>");
		pw.write("</html>");
		pw.flush();
		pw.close();
	}
}