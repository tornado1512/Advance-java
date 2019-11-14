package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.Student;
public class RegisterServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String name=request.getParameter("nm");
		int age=Integer.parseInt(request.getParameter("age"));
		String college=request.getParameter("college");
		String degree=request.getParameter("degree");

		Student student=new Student();
		student.setName(name);
		student.setAge(age);
		student.setCollege(college);
		student.setDegree(degree);
		student.registerStudent();
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}