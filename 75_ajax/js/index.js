var req;
function sendRequest(){
	getAllElements();
	
	req=new XMLHttpRequest();

	var url='act.do?user_name='+enm.value+'&email='+eml.value+'&password='+passw.value;
	alert(url);

	req.open('get',url,true);
	req.onreadystatechange=handleResponse;
	req.send(null);
}

function handleResponse(){
	if(req.readyState==4&&req.status==200){
		alert(req.responseText);
	}	
}
var enm,eml,passw;
function getAllElements(){
	enm=document.getElementById("unm");
	eml=document.getElementById("eml");
	passw=document.getElementById("pass");
}