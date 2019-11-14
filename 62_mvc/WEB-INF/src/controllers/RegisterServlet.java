package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.Student;
import java.util.*;

public class RegisterServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException,NumberFormatException{
		ArrayList<Student> students=Student.collectStudents();
		
		request.setAttribute("students",students);
		
		
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}