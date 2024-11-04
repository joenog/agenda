/**
 * CONFIRMAÇÃO DE EXCLUSÃO DE UM CONTATO
 * AUTOR: JOAB NOG
 */

function confirmar(idcon) {
	let resposta = confirm("Quer mesmo excluir esse cliente?")
	if(resposta === true) {
		alert(idcon)
		//window.location.href = "delete?idcon=" + idcon
	}
}