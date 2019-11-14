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
  <%request.setAttribute("abc","<h1>Mohan</h1>");%>
 ${abc}
 </br>
 </br>
 </br>
 <c:out value="${abc}" escapeXml="false"/>
 </body>
</html>
