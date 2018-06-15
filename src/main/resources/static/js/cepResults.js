$(document).ready(function(){
    connectToWebSocket();
    window.setInterval(function(){
        getTrafficLightValues("k1");
        // getTrafficLightValues("k2");
        getTrafficLightValues("k3");
        getIncidents();
    }, 1000)
})

var stompClient = null;
var connectToWebSocket = function () {
    var socket = new SockJS("/smarttraffic");
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log("connected: "+frame);
        stompClient.subscribe("/incident/event", function (event) {


        })

    })
};

var getIncidents = function(){
    $.ajax({
        url: "/incidents/",
        success: function (result) {
            var barrierClosed = result["barrierS1"];
            var accidentHappened = result["accidentK2"];
            var nitroOxideHigh = result["nitroOxideK2"];
            var nitroOxideLongHigh = result["nitroOxideLongHigh"];
            //schranke unten, sonst nix
            if(barrierClosed && !accidentHappened && !nitroOxideHigh && !nitroOxideLongHigh){
                $("#home_body").css("background-image", "url(../img/2_BahnschrankeUnten_Final.png)");
            }
            //schranke oben, sonst nix
            if(!barrierClosed && !accidentHappened && !nitroOxideHigh && !nitroOxideLongHigh){
                $("#home_body").css("background-image", "url(../img/1_InitialStreetMap_Final.png)");
            }
            //unfall, sonst nix
            if(!barrierClosed && accidentHappened && !nitroOxideHigh && !nitroOxideLongHigh){
                $("#home_body").css("background-image", "url(../img/3_UnfallMitBahnschrankeOben_Final.png)");
            }
            //unfall, schranke unten
            if(barrierClosed && accidentHappened && !nitroOxideHigh && !nitroOxideLongHigh){
                $("#home_body").css("background-image", "url(../img/4_UnfallMitBahnschrankeUnten_Final.png)");
            }
            //stickstoffsensor alarm
            if(nitroOxideHigh && !nitroOxideLongHigh){
                $("#home_body").css("background-image", "url(../img/5_StickstoffsensorAlarm.png)");
            }
            //stickstoffsensor lange hoch
            if(nitroOxideHigh && nitroOxideLongHigh){
                $("#home_body").css("background-image", "url(../img/6_StickstoffsensorUmleitung.png)");
            }
        }
    })
}

var updateTrafficPerMinute = function(id){
    var value = $("#traffic"+id).val();
    console.log(value);
    $.ajax({
        url: "/trafficPerMinute/"+id,
        type: "PUT",
        contentType : "application/json",
        data: value,
        success: function (response) {
            // console.log(response)
        }

    })
}

var getTrafficLightValues = function (trafficLightId) {
    $.ajax({
        url: "/trafficLight/"+trafficLightId,
        success: function (result) {
            // console.log(result);


            var stoNRtw = result["stoNRtw"];
            var stoWRtw = result["stoWRtw"];
            var stoORtw = result["stoORtw"];
            var stoSRtw = result["stoSRtw"];
            var wtoORtw = result["wtoORtw"];
            var wtoNRtw = result["wtoNRtw"];
            var wtoSRtw = result["wtoSRtw"];
            var wtoWRtw = result["wtoWRtw"];
            var otoNRtw = result["otoNRtw"];
            var otoWRtw = result["otoWRtw"];
            var otoSRtw = result["otoSRtw"];
            var otoORtw = result["otoORtw"];
            var ntoNRtw = result["ntoNRtw"];
            var ntoWRtw = result["ntoWRtw"];
            var ntoSRtw = result["ntoSRtw"];
            var ntoORtw = result["ntoORtw"];

            if (typeof stoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoSRtw", stoSRtw);
            }
            if (typeof wtoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoWRtw", wtoWRtw);
            }
            if (typeof otoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoORtw", otoORtw);
            }
            if (typeof ntoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoNRtw", ntoNRtw);
            }
            if (typeof ntoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoWRtw", ntoWRtw);
            }
            if (typeof ntoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoSRtw", ntoSRtw);
            }
            if (typeof ntoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoORtw", ntoORtw);
            }
            if(typeof stoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoNRtw", stoNRtw);
            }
            if(typeof stoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoWRtw", stoWRtw);
            }
            if(typeof stoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoORtw", stoORtw);
            }
            if(typeof wtoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoORtw", wtoORtw);
            }
            if (typeof wtoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoNRtw", wtoNRtw);
            }
            if (typeof wtoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoSRtw", wtoSRtw);
            }
            if (typeof otoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoNRtw", otoNRtw);
            }
            if (typeof otoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoWRtw", otoWRtw);
            }
            if (typeof otoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoSRtw", otoSRtw);
            }

            var stoN = result["stoN"];
            var stoW = result["stoW"];
            var stoO = result["stoO"];
            var stoS = result["stoS"];
            var wtoO = result["wtoO"];
            var wtoN = result["wtoN"];
            var wtoS = result["wtoS"];
            var wtoW = result["wtoW"];
            var otoN = result["otoN"];
            var otoW = result["otoW"];
            var otoS = result["otoS"];
            var otoO = result["otoO"];
            var ntoN = result["ntoN"];
            var ntoW = result["ntoW"];
            var ntoS = result["ntoS"];
            var ntoO = result["ntoO"];

            if(typeof stoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoS", stoS);
            }
            if(typeof wtoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoW", wtoW);
            }
            if(typeof otoO !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoO", otoO);
            }
            if(typeof ntoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoN", ntoN);
            }
            if(typeof ntoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoW", ntoW);
            }
            if(typeof ntoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoS", ntoS);
            }
            if(typeof ntoO !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoO", ntoO);
            }

            if(typeof stoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoN", stoN);
            }
            if(typeof stoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoW", stoW);
            }
            if(typeof stoO !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoO", stoO);
            }
            if(typeof otoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoW", otoW);
            }
            if (typeof wtoO !== 'undefined'){

                setTableValue("#"+trafficLightId+"wtoO", wtoO);
            }
            if (typeof wtoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoN", wtoN);
            }
            if (typeof otoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoN", otoN);
            }
            if (typeof wtoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoS", wtoS);
            }
            if (typeof otoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoS", otoS);
            }

        }
    })
}

var setTableValue = function(elementId, value){
    // console.log("value: "+elementId)
    var element = $(elementId);
    if(value.incident){
        element.html("<i class='fa fa-arrow-"+value.arrow+"' style='font-size:24px;color:red'></i>");
    } else {
        element.html("<i class='fa fa-arrow-"+value.arrow+"' style='font-size:24px;color:black'></i>");
    }

    // console.log(element)
}

var changeCheckbox = function (id, incident, place) {
    stompClient.send("/esp/incident", {}, JSON.stringify({'event':incident, 'crossing':place}));
    var data = $("#"+id).is(':checked');

    $.ajax({
        url: "/"+incident+"/"+place,
        type: "POST",
        data: data.toString(),
        contentType : "application/json",
        success: function(result) {
            console.log(result)
        }
    })

    var barrier = $("#switch-railroad");
    var accident = $("#switch-unfall");
    var nitrooxygen = $("#switch-stickoxid");
    console.log(barrier.is(":checked"));


}