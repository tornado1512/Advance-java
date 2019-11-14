package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.City;
import com.google.gson.Gson;

public class CollectRecordsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			String city = request.getParameter("city");
			Gson gson=new Gson();
			String jsonString=gson.toJson(City.collectCities(city));
			response.getWriter().write(jsonString);
	}
}