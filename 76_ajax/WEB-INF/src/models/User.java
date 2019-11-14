package models;
import java.sql.*;
import java.util.ArrayList;
public class User{
	private String userName;
	private String email;
	private String password;
	private Integer userId;
	
	public boolean saveUser(){
		int i=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			String query="insert into users (username,email,password) value(?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,userName);
			pst.setString(2,email);
			pst.setString(3,password);
			i=pst.executeUpdate();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		if(i==1){
			return true;
		}
		else{
			return false;
		}
	}
	public static ArrayList<User> collectUsers(){
		ArrayList<User> users=new ArrayList<User>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			String query="select * from users";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				User user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				users.add(user);
			}
		}catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return users;
	}
	public User(String userName,String email,String password){
		this.userName=userName;
		this.email=email;
		this.password=password;
	}
	public User (Integer userId,String userName,String email,String password){
		this.userId=userId;
		this.userName=userName;
		this.email=email;
		this.password=password;
		
	}
	public void setUserName(String userName){
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
	
	public void setPassword(String Password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
}