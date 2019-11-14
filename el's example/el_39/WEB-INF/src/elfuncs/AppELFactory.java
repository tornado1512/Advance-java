package elfuncs;
import java.sql.*;
import java.util.*;
import models.*;

public class AppELFactory{
	public static String getRecords(ArrayList<User> users){
		String str="<table border='2' width='50%'>";
		for(User user:users){
			str+="<tr><td>"+user.getUserId()+"</td>";
			str+="<td>"+user.getPassword()+"</td>";
			str+="<td>"+user.getEmail()+"</td>";
			str+="<td>"+user.getPassword()+"</td></tr>";
		}
		str+="</table>";
		return str;
	}
}