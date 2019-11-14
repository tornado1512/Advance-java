<%@page import="java.util.*"%>
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
  <%Map m=new HashMap();%>
  <%m.put("abc",123);%>
  <%m.put("mno",456);%>
  <%request.setAttribute("records",m);%>
  <%request.setAttribute("abc","mno");%>
###########################</br></br></br>
  ${records}</br></br></br>
  #############################</br></br></br>
  ${records.abc}</br></br></br>
  #############################</br></br></br>
  ${records['abc']}</br></br></br>
  ##############################</br></br></br>
  ${records[abc]}</br></br></br>
  
 </body>
</html>
