package models;

import java.sql.*;
import java.util.*;
public class City{
	private Integer cityId;
	private String cityName;

	public City(Integer cityId,String cityName){
		this.cityId=cityId;
		this.cityName=cityName;
	}
	public City(){}
	public static ArrayList<City> collectCities(String ct){
		ArrayList<City> cities=new ArrayList<City>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");
			String query="select city_id,city from cities where city like'"+ct+"%'";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				City city= new City(rst.getInt(1),rst.getString(2));
				cities.add(city);
			}
		}
		catch (ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return cities;
	}
	public void setCityId(Integer cityId){
		this.cityId=cityId;
	}
	public Integer getCityid(){
		return cityId;
	}
	
	public void setCityName(String cityName){
		this.cityName=cityName;
	}
	public String getCityName(){
		return cityName;
	}
}