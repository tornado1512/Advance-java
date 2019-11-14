package models;

import java.sql.*;
import java.util.*;
public class City{
	private Integer cityId;
	private String city;

	public City(){}
	public City(String city){
		this.city=city;
	}
	public static ArrayList<City> getCities(){
		ArrayList<City> cities=new ArrayList<City>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");
			String query="select city from cities";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				City city= new City(rst.getString(1));
				cities.add(city);
			}
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return cities;
	}
	public void setCityId(Integer cityId){
		this.cityId=cityId;
	}
	public Integer getCityId(){
		return cityId;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
}