window.onload=initAll;
 function initAll(){
	 
	getAllElements();
	setAllActions();
 }
 function setAllActions(){
	
	xyz.onclick=collectRecords;
 }
 var reqs;
 function collectRecords(){
	reqs=new XMLHttpRequest();
	reqs.open('get','collect.do',true);
	reqs.onreadystatechange=showRecords;
	reqs.send(null);
 }
function showRecords(){
	if(reqs.readyState==4&&reqs.status==200){
		
		var records=eval(reqs.responseText);
		var len=records.length;
		
		for(i=0;i<len;i++){
			
			var row=aaa.insertRow(i);
			var obj=records[i];
			n=0;

			for(x in obj){
				var cell=row.insertCell(n);
				cell.innerHTML=obj[x];
				n++;
				
			}
		}	
	}
}

var req;
function sendRequest(){
	getAllElements();

	req=new XMLHttpRequest();
	url='act.do?uname='+uname.value+'&email='+email.value+'&passw='+passw.value;
	req.open('get',url,true);
	req.onreadystatechange=handleRequest;
	req.send(null);
}
function handleRequest(){
	if(req.readyState==4&&req.status==200){
		alert(req.responseText);
	}
}
var xyz,aaa;
var uname,email,passw;
function getAllElements(){
	uname=document.getElementById("uname");
	email=document.getElementById("email");
	passw=document.getElementById("passw");
	
	xyz=document.getElementById("xyz");
	aaa=document.getElementById("aaa");

}