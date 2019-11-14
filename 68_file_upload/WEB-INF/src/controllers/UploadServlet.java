package controllers;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;

import org.apache.commons.fileupload.servlet.ServletFileUpload; 
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;

public class UploadServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		//String uname=request.getParameter("uname");
		//String email=request.getParameter("email");
		//System.out.println(uname);
		//System.out.println(email);
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif=new DiskFileItemFactory();
			ServletFileUpload sfu=new ServletFileUpload(dfif);
			try{
				List<FileItem> fileItems=sfu.parseRequest(request);
				String realPath=getServletContext().getRealPath("/");
				for(FileItem fileItem:fileItems){
					if(fileItem.isFormField()){
						if(fileItem.getFieldName().equals("uname")){
							String uname=fileItem.getFieldName();
							System.out.println(fileItem.getString());
						}/*
						else if(fileItem.getFieldName().equals("tim")){
							System.out.println(Timestamp.valueOf(fileItem.getString()));
//							System.out.println(ts);
						}*/
						else{
							String email=fileItem.getFieldName();
							//System.out.println(request.getParameter(email));
						//	System.out.println(email);
						}
					}
					else{
						File file=new File(realPath,fileItem.getName());
						System.out.println(file.getAbsoluteFile());
						System.out.println(file.getAbsolutePath());
						System.out.println(file.getPath());
						try{
							fileItem.write(file);
						}
						catch (Exception e){
							e.printStackTrace();
							}
						}
					}
				}
				catch (FileUploadException e){
				e.printStackTrace();
				}	
			}
		request.getRequestDispatcher("next.jsp").forward(request,response);
		}
	}


