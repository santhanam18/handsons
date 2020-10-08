const event = new Array();
const sort = new Array();
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
      document.getElementById("Message").innerHTML = "Event Name added Successfully!"
  }
}

function displayEvent() {
  document.getElementById("Result").innerHTML = "Event Details"
  document.getElementById("EventName").innerHTML = "Event name"
  event.sort();
  for ( k = 0; k < event.length; k++) {
      document.getElementById("addedEvent").innerHTML += event[k]+"<br>"
      console.log(event[k]);
  }
}