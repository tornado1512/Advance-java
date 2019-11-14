window.onload=initAll;

function initAll(){
	ab=document.getElementById("ab");
	ab.onclick=sendRequest;
}
function sendRequest(){
	
	req=new XMLHttpRequest();
	req.open('get','act.do','true');
	req.onreadystatechange=showResponse;
	req.send(null);
	
}
function showResponse(){
	//alert(req.readyState+'~~~'+req.status);
	if(req.readyState==4&&req.status==200){
		alert("hqqq");
		alert(req.responseText);
	}

}