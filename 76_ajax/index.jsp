<em></em><!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <script src="js/index.js"></script>
  <title>Document</title>
 </head>
 <body>
  <table>
	<tr>
		<td>UserName</td>
		<td>:</td>
		<td><input type="text" id="uname"></td>
	</tr>
	<tr>
		<td>Email</td>
		<td>:</td>
		<td><input type="text" id="email"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td>:</td>
		<td><input type="password" id="passw"></td>
	</tr>
    <tr>
		<td><input type="button" onclick="sendRequest()" value="register"></td>
	</tr>
  </table>
  <span id="xyz">show records</span>
  <table>
		<thead>
			<tr>
				<th>UserId</th>
				<th>UserName</th>
				<th>Email</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody id="aaa">
				
		</tbody>

  </table>
 </body>
</html>
