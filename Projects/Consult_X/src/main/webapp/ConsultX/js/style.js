/*   Java script source code file    */

/*  Sign up form Onsubmit button    */

function validateForm(){
	var checkBox=document.getElementById("flexCheckDefault");
	if(!checkBox.checked){
		alert("Please agree to the terms & conditions before submitting.");
		return false;
	}
	return true;
}
