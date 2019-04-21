function validateData(){

	var uName = document.addForm.uName.value;

	if(uName == ""){
		alert("Username is empty !!");
	}

	if(document.addForm.adminName.value == ""){
		alert("Name cannot be empty !!");
	}

	if(document.addForm.password.value == ""){
		alert("Password cannot be empty !!");
	}

	if(document.addForm.tel.value == "" &&  document.addForm.tel.value.length < 10 ){
		alert("Please enter a valid telephone number !!");
	}

	
}