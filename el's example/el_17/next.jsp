<%@page import ='models.User'%>
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
  ${requestScope.arr}
  ###############################
</br>
  ${requestScope.arr[0]}
  ${requestScope.arr[1]}
  </br>
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
  ${requestScope.arr[0][0]}
  ${requestScope.arr[0][1]}
  ${requestScope.arr[0][2]}
  ########################

  ${requestScope.arr[1][0]}
  ${requestScope.arr[1][1]}
  ${requestScope.arr[1][2]}
  </body>
</html>
