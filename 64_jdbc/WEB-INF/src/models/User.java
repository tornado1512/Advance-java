package models;
import java.sql.*;
import java.util.ArrayList;
public class User
{
	private int userId;
	private String userName;
	private String email;
	private String password;

	public void saveRecord(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
		String query="insert into users (username,email,password) value(?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,userName);
		pst.setString(2,email);
		pst.setString(3,password);
		pst.executeUpdate();
		con.close();
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
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
			User user=new User(rs.getInt("user_id"),rs.getString("username"),rs.getString("email"),rs.getString("password"));
			users.add(user);
			}
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return users;
	}
	User(int userId,String userName,String email,String password){
		this.userId=userId;
		this.userName=userName;
		this.email=email;
		this.password=password;
	}
	public User(){
		
	}
	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return userId;
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
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
}