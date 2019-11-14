package elfuncs;
import java.sql.*;
import java.util.*;
import models.*;

public class AppELFactory{
	
	public static String getStates(ArrayList<State> states){
		String str="<select>";
		for(State st:states){
			str+="<option>"+st.getState()+"</option>";
		}
		str+="</select>";
		return str;
	}
	public static String getCities(ArrayList<City> cities){
		String str="<select>";
		for(City ct:cities){
			str+="<option>"+ct.getCity()+"</option>";
		}
		str+="</select>";
		return str;
	}
}