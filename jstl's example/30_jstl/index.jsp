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
  <c:set var="abc" value="123" scope="request"/>
  <c:set var="abc" value="456" scope="session"/>
  Attribute in request scope:<c:out value="${requestScope.abc}"/></br>
  Attribute in session scope:<c:out value="${sessionScope.abc}"/></br>
  <c:remove var="abc" scope="request"/>
  Attribute in request scope:<c:out value="${requestScope.abc}"/></br>
  Attribute in session scope:<c:out value="${rsessionScope.abc}"/></br>
  
 </body>
</html>
