<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <h1>One Page</h1>
  
  <c:url value="home.jsp" var="home_enc" scope="session"/>
  <a href="${home_enc}">Homepage</a></br></br>
  session<%=session.getId()%></br></br>
  <a href="<c:url value='two.jsp'/>">GotoTwoPage</a>
 </body>
</html>
