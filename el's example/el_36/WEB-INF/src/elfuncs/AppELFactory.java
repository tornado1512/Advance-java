package elfuncs;

public class AppELFactory{
	public static String showData(){
		String resp="<table border='1' width='200'>";
		String [] str={"mohan","sohan","rohan","gohan","zohan"};

		for(String s:str){
			resp+="<tr><td>"+s+"</td></tr>";
			}
		resp=resp+"</table>";
		return resp;
	}
}