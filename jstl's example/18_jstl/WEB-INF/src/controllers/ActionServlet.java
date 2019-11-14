package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Book;

public  class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		Book book = new Book();
		book.setBookId(1);
		book.setBookTitle("java");
		book.setBookAuthor("Ingole");
		book.setBookPrice(400);
		
		request.setAttribute("bk",book);
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}