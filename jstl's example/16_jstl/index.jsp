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
  <c:set var="aaa" value="333" />
  <c:out value="${pageScope.aaa}"/></br>
  ###########################</br>
  
  <c:out value="${requestScope.aaa}"/></br>
  ###########################</br>
  
  <c:out value="${sessionScope.aaa}"/></br>
  ###########################</br>
  
  <c:out value="${applicationScope.aaa}"/></br>
  ###########################</br>
 </body>
</html>
