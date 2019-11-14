package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import models.*;
import java.util.*;
public class ScopeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		HttpSession session=request.getSession();
		ArrayList<State> states=State.getStates();
		ArrayList<City> cities=City.getCities();
		session.setAttribute("states",states);
		session.setAttribute("cities",cities);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}