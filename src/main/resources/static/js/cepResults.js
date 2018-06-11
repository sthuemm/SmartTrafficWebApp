$(document).ready(function(){
    window.setInterval(function(){
        getTrafficLightValues("k1");
        // getTrafficLightValues("k2");
        getTrafficLightValues("k3");

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
                setTableValue("#"+trafficLightId+"stoSRtw", stoSRtw.arrow);
            }
            if (typeof wtoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoWRtw", wtoWRtw.arrow);
            }
            if (typeof otoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoORtw", otoORtw.arrow);
            }
            if (typeof ntoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoNRtw", ntoNRtw.arrow);
            }
            if (typeof ntoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoWRtw", ntoWRtw.arrow);
            }
            if (typeof ntoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoSRtw", ntoSRtw.arrow);
            }
            if (typeof ntoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoORtw", ntoORtw.arrow);
            }
            if(typeof stoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoNRtw", stoNRtw.arrow);
            }
            if(typeof stoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoWRtw", stoWRtw.arrow);
            }
            if(typeof stoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoORtw", stoORtw.arrow);
            }
            if(typeof wtoORtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoORtw", wtoORtw.arrow);
            }
            if (typeof wtoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoNRtw", wtoNRtw.arrow);
            }
            if (typeof wtoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoSRtw", wtoSRtw.arrow);
            }
            if (typeof otoNRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoNRtw", otoNRtw.arrow);
            }
            if (typeof otoWRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoWRtw", otoWRtw.arrow);
            }
            if (typeof otoSRtw !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoSRtw", otoSRtw.arrow);
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
                setTableValue("#"+trafficLightId+"stoS", stoS.arrow);
            }
            if(typeof wtoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoW", wtoW.arrow);
            }
            if(typeof otoO !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoO", otoO.arrow);
            }
            if(typeof ntoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoN", ntoN.arrow);
            }
            if(typeof ntoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoW", ntoW.arrow);
            }
            if(typeof ntoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoS", ntoS.arrow);
            }
            if(typeof ntoO !== 'undefined'){
                setTableValue("#"+trafficLightId+"ntoO", ntoO.arrow);
            }

            if(typeof stoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoN", stoN.arrow);
            }
            if(typeof stoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoW", stoW.arrow);
            }
            if(typeof stoO !== 'undefined'){
                setTableValue("#"+trafficLightId+"stoO", stoO.arrow);
            }
            if(typeof otoW !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoW", otoW.arrow);
            }
            if (typeof wtoO !== 'undefined'){

                setTableValue("#"+trafficLightId+"wtoO", wtoO.arrow);
            }
            if (typeof wtoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoN", wtoN.arrow);
            }
            if (typeof otoN !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoN", otoN.arrow);
            }
            if (typeof wtoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"wtoS", wtoS.arrow);
            }
            if (typeof otoS !== 'undefined'){
                setTableValue("#"+trafficLightId+"otoS", otoS.arrow);
            }

        }
    })
}

var setTableValue = function(elementId, value){
    // console.log("value: "+elementId)
    var element = $(elementId);
    element.html("<i class='fa fa-arrow-"+value+"' style='font-size:24px'></i>");
    // console.log(element)
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