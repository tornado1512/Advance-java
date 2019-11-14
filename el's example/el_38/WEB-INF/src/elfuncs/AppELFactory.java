package elfuncs;
import java.sql.*;
public class AppELFactory{
	public static String getRecords(){
		String str="<select>";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/records?user=root&password=1234");
			String query="select user_name from users";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				str+="<option>"+rst.getString(1)+"</option>";
			}
			str+="</select>";
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return str;
	}
}