$(document).ready(function(){
    window.setInterval(function(){
        getTrafficLightValues("K1");
        getTrafficLightValues("K2");
        getTrafficLightValues("K3");

    }, 1000)
})

var updateTrafficPerMinute = function(id){
    var value = $("#traffic"+id).val();
    console.log(value);
    $.ajax({
        url: "/trafficPerMinute/"+id,
        type: "PUT",
        contentType : "application/json",
        data: value,
        success: function (response) {
            console.log(response)
        }

    })
}

var getTrafficLightValues = function (trafficLightId) {
    $.ajax({
        url: "/trafficLight/"+trafficLightId,
        success: function (result) {
            console.log(result);
            var stoN = result["stoN"];
            var wtoO = result["wtoO"];
            var wtoN = result["wtoN"];
            var otoN = result["otoN"];
            var wtoS = result["wtoS"];
            var otoS = result["otoS"];
            var wtoNOtoS = result["wtoNOtoS"];
            if(typeof stoN !== 'undefined'){
                setTableValue("#stoN."+trafficLightId, stoN.value);
            } if (typeof wtoO !== 'undefined'){
                setTableValue("#wtoO."+trafficLightId, wtoO.value);
            } if (typeof wtoN !== 'undefined'){
                setTableValue("#wtoN."+trafficLightId, wtoN.value);
            } if (typeof otoN !== 'undefined'){
                setTableValue("#otoN."+trafficLightId, otoN.value);
            } if (typeof wtoS !== 'undefined'){
                setTableValue("#wtoS."+trafficLightId, wtoS.value);
            } if (typeof otoS !== 'undefined'){
                setTableValue("#otoS."+trafficLightId, otoS.value);
            } if (typeof wtoNOtoS !== 'undefined'){
                setTableValue("#wtoNOtoS."+trafficLightId, wtoNOtoS.value);
            }
        }
    })
}

var setTableValue = function(elementId, value){
    console.log("value: "+elementId)
    var element = $(elementId);
    element.html(value);
    console.log(element)
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