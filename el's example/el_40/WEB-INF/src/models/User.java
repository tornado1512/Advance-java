package models;
import java.util.*;
import java.sql.*;

public class User{
	private Integer userId;
	private String userName;
	private String	 email;
	private String password;
	
	public User(Integer userId,String userName,String email,String password){
		this.userId=userId;
		this.userName=userName;
		this. email= email;
		this.password=password;
	}
	public static ArrayList<User> getRecords(){
		ArrayList<User> users=new ArrayList<User>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			String query="select * from users";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				User user=new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4));
				users.add(user);
			}
			con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return users;
	}
	public void setuserId(Integer userId){
		this.userId=userId;
	}
	public Integer getUserId(){
		return userId;
	}
	public void setuserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
}