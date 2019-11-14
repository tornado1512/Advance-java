package models;

import java.sql.*;
import java.util.*;
public class State{
	private Integer stateId;
	private String state;

	public State(){}
	public State( String state){
		
		this.state=state;
	}
	public static ArrayList<State> getStates(){
		ArrayList<State> states=new ArrayList<State>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");
			String query="select state from states ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				State state = new State(rst.getString(1));
				states.add(state);
			}
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
		return states;
	}
	public void setStateId(Integer stateId){
		this.stateId=stateId;
	}
	public Integer getStateId(){
		return stateId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return state;
	}
}