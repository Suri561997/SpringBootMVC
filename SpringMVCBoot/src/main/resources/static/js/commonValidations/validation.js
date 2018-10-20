
function integersOnly(txb) {
	txb.value = txb.value.replace(/[^\d]/g,'');
}

function validateCharacters(txb) {
	txb.value = txb.value.replace(/[^\A-Za-z]/g,'');
}

/*function formValidations(obj) {
	alert(obj);
	var sel = document.getElementById(obj).type;
	alert(sel)
}*/