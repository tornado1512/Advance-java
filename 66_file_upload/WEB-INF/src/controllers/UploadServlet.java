package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;

public class UploadServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif=new DiskFileItemFactory();
			ServletFileUpload sfu=new ServletFileUpload(dfif);
			String realPath=getServletContext().getRealPath("/");
			try
			{
				List<FileItem> fileItems=sfu.parseRequest(request);
				for (FileItem fileItem:fileItems ){
					File file=new File(realPath,fileItem.getName());
					try
					{
						fileItem.write(file);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
			catch (FileUploadException e)
			{
				e.printStackTrace();
			}
		}
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}