const event = new Array();
function addEvent() {
  var eventName = document.getElementById("event").value;
  console.log(eventName);
  let eventExist = 0;
  for (i = 0; i < event.length; i++) {

      if (event[i] === eventName) {
          console.log(event);
          document.getElementById("Message").innerHTML = "Event Name already Exists. Try with some other name"
          eventExist++;

      } else
          break;
  }

  if (eventExist == 0) {
      let c = event.push(eventName);
      console.log(c);
      console.log(event);
      document.getElementById("Message").innerHTML = "Event added Successfully"
  }
}
function popEvent() {
   document.getElementById("addedEvent").innerHTML = ""
    var eventName = document.getElementById("Event").value;
    console.log(eventName);

    let c = event.pop(eventName);
    document.getElementById("Message").innerHTML = "Removed Successfully"
    console.log(c);

    if (event.length == 0) {
        document.getElementById("Message").innerHTML = "The List is Empty"
    }
}

function sortDisplay() {
  document.getElementById("Result").innerHTML = " The Events in the Array"
  for ( k = 0; k < event.length; k++) {
      document.getElementById("addedEvent").innerHTML += event[k]+"<br>"
      console.log(event[k]);
  }
}