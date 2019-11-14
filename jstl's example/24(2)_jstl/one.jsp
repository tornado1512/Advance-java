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
  
  <h1>One page</h1>
    <%=session.getId()%>
	<%String encURL = response.encodeURL("two.jsp");%>
  <a href="<%=encURL%>">Go to onePage</a>
 </body>
</html>
