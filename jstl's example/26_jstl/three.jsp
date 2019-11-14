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
  <h1>ThreePage</h1>
  
  <c:url value="home.jsp" var="home_enc" scope="session"/>
  <a href="${home_enc}">Homepage</a></br></br>

  session:<%=session.getId()%></br></br>

 </body>
</html>
