<%@page import="java.util.ArrayList"%>
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
 <%ArrayList<String> lest=new ArrayList<String>();%>
 <%lest.add("Virat");%>
 <%lest.add("Rohit");%>
 <%lest.add("MSD");%>
 <%lest.add("Shikhar");%>
 <%lest.add("Hardik");%>
 <%lest.add("Bhumrah");%>
 <%session.setAttribute("list",lest);%>
 <a href="next.jsp">Next page</a>
 </body>
</html>
