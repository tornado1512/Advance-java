package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.User;
import java.util.ArrayList;
import com.google.gson.Gson;

public class CollectServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ArrayList<User> users=User.collectUsers();
		Gson gson=new Gson();
		String jsonString = gson.toJson(users);
		response.getWriter().write(jsonString);
	}
}

