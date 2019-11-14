window.onload=initAll;
function initAll(){
	getAllElements();
	setAllActions();
}
var regis,um,em,pw,rpw;
var ummsg,emmsg,pwmsg,rpwmsg;
function getAllElements(){
	
	regis=document.getElementById("register");
	
	um=document.getElementById("um");
	em=document.getElementById("em");
	pw=document.getElementById("pw");
	rpw=document.getElementById("rpw");
	
	ummsg=document.getElementById("ummsg");
	emmsg=document.getElementById("emmsg");
	pwmsg=document.getElementById("pwmsg");
	rpwmsg=document.getElementById("rpwmsg");

}

function setAllActions(){
	regis.onsubmit=validate;
}

function validate(){
	var flag=true;
	
	
	if(um.value.length<3){
		flag=false;
		ummsg.style.visibility="visible";
	}
	var emTest=/\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/.test(em.value);
	if(!emTest){
		flag=false;
		emmsg.style.visibility="visible";
	}
	
	if(pw.value.length<3||pw.value.length>12){
		flag=false;
		pwmsg.style.visibility="visible";
	}

	if(pw.value!=rpw.value){
		flag=false;
		rpwmsg.style.visibility="visible";
		alert("helloo");
	}
	
	if(!flag){
		return flag;
	}

}																			