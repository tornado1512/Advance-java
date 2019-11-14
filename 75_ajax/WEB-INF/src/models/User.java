package models;
import java.sql.*;

public class User
{
	private String user;
	private String email;
	private String password;
	
	public User(String user,String email,String password){
		this.user=user;
		this.email=email;
		this.password=password;
	}
	public boolean saveUser(){
		boolean resp=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");

			String query="insert into users (username,email,password) value(?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,user);
			pst.setString(2,email);
			pst.setString(3,password);
			int i=pst.executeUpdate();
			con.close();
			if(i==1){
				resp=true;
			}
			else{
				resp=false;
			}
			
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return resp;
	}
	public void setUser(String user){
		this.user=user;
	}
	public String getUser(){
		return user;
	} 
	
	public void setEmail(String Email){
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