var exampleModal = document.getElementById("exampleModal");
exampleModal.addEventListener("show.bs.modal", function (event) {
  // Button that triggered the modal
  var button = event.relatedTarget;
  // Extract info from data-bs-* attributes
  var recipient = button.getAttribute("data-bs-whatever");
  // If necessary, you could initiate an AJAX request here
  // and then do the updating in a callback.
  //
  // Update the modal's content.
  var modalTitle = exampleModal.querySelector(".modal-title");
  var modalBodyInput = exampleModal.querySelector(".modal-body input");

  modalTitle.textContent = "New message to " + recipient;
  modalBodyInput.value = recipient;
});

var botonContratame = document.getElementById("botonContratame");

function botonContratame() {
  //Ingresamos un mensaje
  var mensaje = confirm("Contratame");
  //Verificamos si el usuario acepto el mensaje
  if (mensaje) {
    alert("¡Gracias por confirmar!");
  }
  //Verificamos si el usuario denegó el mensaje
  else {
    alert("¡Piensalo, tienes tiempo!");
  }
}
