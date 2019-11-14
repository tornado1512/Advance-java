window.onload = initAll;
function initAll(){
	getAllElements();
	setAllActions();
}
var records,fld;
function getAllElements(){
	fld=document.getElementById("fld");
	records=document.getElementById("records");
}
function setAllActions(){
	fld.onkeyup=collectRecords;
	
}
var req;
function collectRecords(){
	if(fld.value.length>2){
		req=new XMLHttpRequest();
		req.open('get','collect.do?city='+fld.value,true);
		req.onreadystatechange=handleResponse;
		req.send(null);
	}
}
function handleResponse(){
	//alert(req.readyState);
	if(req.readyState==4&&req.status==200){
		alert(req.responseText);
		records.innerHTML="";
		records.style.display='block';
		var arr=eval(req.responseText);
		alert(arr);
		for(i=0;i<arr.length;i++){
			var elm=document.createElement('div');
			elm.className="rec";
			elm.innerHTML=arr[i]['cityName'];
			records.appendChild(elm);
		}
	}
}