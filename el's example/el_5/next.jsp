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

<%pageContext.setAttribute("abc",true);%>
 ${abc}
</br></br></br>
 #############################
</br></br></br>
${requestScope.abc}
</br></br></br>
#############################
</br></br></br>
${sessionScope.abc}
</br></br></br>
#############################
</br></br></br>
${applicationScope.abc}
</br></br></br>
${pageScope.abc}

 </body>
</html>
