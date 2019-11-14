window.onload=initAll;

var uploadBox;
var add;
function initAll(){
	getAllElements();
	getAllAction();
}
function getAllElements(){
	 uploadBox = document.getElementById("uploadBox");
	 add=document.getElementById("add");
}
function getAllAction(){
	add.onclick=AddNewInputField;
}
var i=2
function AddNewInputField(){
	var inp=document.createElement('input');
	inp.setAttribute('type','file');
	inp.setAttribute('name','flp'+i);
	i++;
	inp.className='inpcls';
	uploadBox.appendChild(inp);
	var br=document.createElement('br');
	uploadBox.appendChild(br);
	var br=document.createElement('br');
	uploadBox.appendChild(br);
}