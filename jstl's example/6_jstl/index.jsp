<%@page import="java.util.HashSet"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
 </head>
 <body>
  <%HashSet<Float> set=new HashSet<Float>();%>
  <%set.add(23.45f);%>
  <%set.add(56.45f);%>
  <%set.add(86.45f);%>
  <%set.add(11.45f);%>
  <%set.add(20.45f);%>
  
  <%session.setAttribute("set",set);%>
  <a href="next.jsp">nextpage</a>
 </body>
</html>
