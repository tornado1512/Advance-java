package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.google.gson.Gson;
import models.City;

public class CollectRecordsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String city=request.getParameter("city");
		System.out.println(City.collectCities(city));
		Gson gson = new Gson();
		String jsonString=gson.toJson(City.collectCities(city));
		System.out.println(jsonString);
		response.getWriter().write(jsonString);

	}
}