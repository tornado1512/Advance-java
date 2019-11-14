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
  
 # <c:set var="abc" value="abc" scope="session"/>#
 #<c:out value="${abc}"/>#
 </br>
 <c:remove var="abc"/>
  #<c:out value="${abc}"/>#
 </body>
</html>
