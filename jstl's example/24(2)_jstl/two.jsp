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
  
  <h1>Two Page</h1>
    <%=session.getId()%>
	
	<%String encURL = response.encodeURL("three.jsp");%>
  <a href="<%=encURL%>">Go to onePage</a>
  
 </body>
</html>
