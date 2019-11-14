package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String message="";
		String serv="index.jsp";
		boolean flag=true;
		String userName=request.getParameter("uname");
		String email=request.getParameter("email");
		String password=request.getParameter("passw");
		String rePassword=request.getParameter("rpassw");
		System.out.println(password);
		System.out.println(rePassword);
		Pattern p=Pattern.compile("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
		Matcher matcher=p.matcher(email);
		if(userName.length()<3){
			flag=false;
			message=message+"Username must be greater than 3character</br>";
		}
		if(!matcher.lookingAt()){
			flag=false;	
			message=message+"incorrect format</br> ";
		}
		if(password.length()<3||password.length()>12){
			flag=false;
			message=message+"password length must be greater than3 and less tha 12</br>";
		}
		if(!password.equals(rePassword)){
			flag=false;
			message=message+"password not match";
		}
		if(flag){
			serv="success.jsp";
		}
		request.setAttribute("errMesg",message);

		request.getRequestDispatcher(serv).forward(request,response);


	}
}