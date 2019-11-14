<%@page import="java.util.ArrayList"%>
<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
  <%int [] a1={11,12,13,14};
		int [] a2={21,22,23,44};
		int [] a3={51,42,33,34};
		int [] a4={61,32,23,04};
	ArrayList<int []> list=new ArrayList<int[]>();
	list.add(a1);
	list.add(a2);
	list.add(a3);
	list.add(a4);
	session.setAttribute("list",list);	
  %>
  <a href="abc.jsp">nexPage</a>
 </body>
</html>
