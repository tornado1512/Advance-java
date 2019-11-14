package abc;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		Student s1=new Student("mohan",14,"Abc School");
		Student s2=new Student("sohan",16,"Mno School");
		Student s3=new Student("rohan",18,"Pqr School");
		Student s4=new Student("yohan",18,"GGITS");
		

		ArrayList<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		request.setAttribute("students",students);

		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}