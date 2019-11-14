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
  <c:out value="${requestScope.abc.title}"/>
  <c:out value="${sessionScope.abc.title}"/>
  #######################################
  <c:set  var ="x" value="${abc}" scope="session"/>
  <c:out value="${requestScope.abc.title}"/>
  <c:out value="${sessionScope.x.title}"/>
 </body>
</html>
