$(document).ready(function(){
    window.setInterval(function(){
        getTrafficLightValues("K1");
        getTrafficLightValues("K2");
        getTrafficLightValues("K3");

    }, 1000)


})

var getTrafficLightValues = function (trafficLightId) {
    $.ajax({
        url: "/trafficLight/"+trafficLightId,
        success: function (result) {
            console.log(result)
        }
    })
}

var changeCheckbox = function (id, incident, place) {
    var data = $("#"+id).is(':checked');
    console.log(data);
    $.ajax({
        url: "/"+incident+"/"+place,
        type: "POST",
        data: data.toString(),
        contentType : "application/json",
        success: function(result) {
            console.log(result)
        }
    })
}