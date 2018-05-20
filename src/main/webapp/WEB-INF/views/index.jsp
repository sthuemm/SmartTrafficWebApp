<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Smart Traffic with Complex Event Processing engine Esper</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>

    <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery-toggles/2.0.4/toggles.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-toggles/2.0.4/toggles.min.js"></script>

    <link href="css/switchButton.css" rel="stylesheet">

    <script src="js/cepResults.js"></script>

</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <h3>Ergebnisse</h3>
                <br>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">Kreuzung</th>
                            <th scope="col">Ampel</th>
                            <th scope="col">Dauer Gruenphase (Minuten)</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="intersection" items="${intersections}">
                        <tr>
                            <td scope="row" id="${intersection.key}"><c:out value="${intersection.key}"/></td>
                            <c:set var="trafficlights" value="${intersection.value.trafficLights}"/>
                            <c:forEach var="trafficLight" items="${trafficlights}">
                                <tr>
                                    <td></td>
                                    <td><c:out value="${trafficLight.key}"/></td>
                                    <td class="${intersection.key}" id="${trafficLight.key}"><c:out value="${trafficLight.value}"/></td>
                                </tr>
                            </c:forEach>
                        </tr>
                        </c:forEach>
                    </tbody>


                </table>
            </div>
            <div class="col">
                <h3>Ereignisse ausloesen</h3>
                <br>
                <p>Bahnschranke</p>
                <label class="switch">
                    <input type="checkbox" id="switch-railroad" onchange="changeCheckbox('switch-railroad','railroad','S1')">
                    <div class="slider round railroad"></div>
                </label>

                <br>
                <p>Verkehrslage Kreuzung 2</p>
                <label class="switch">
                    <input type="checkbox" id="switch-unfall" onchange="changeCheckbox('switch-unfall','accident', 'K2')">
                    <div class="slider round unfall"></div>
                </label>
                <br>
                <p>Stickoxid-Werte an Kreuzung 2</p>
                <label class="switch">
                    <input type="checkbox" id="switch-stickoxid" onchange="changeCheckbox('switch-stickoxid','nitrogenOxide', 'K2')">

                    <div class="slider round stickoxid"></div>
                </label>
            </div>
            <div class="col">
                <h3>Ereignissstroeme</h3>
                <br>
                <div class="row">
                    <label for="Verkehr von O <--> W  ">Verkehr von O <--> W  </label>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Fahrzeuge pro Minute</span>
                        </div>
                        <input type="number" class="form-control" id="Verkehr von O <--> W  " aria-describedby="basic-addon3" value="10">
                    </div>
                </div>
                <div class="row">
                    <label for="Verkehr von N <--> S  ">Verkehr von N <--> S  </label>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Fahrzeuge pro Minute</span>
                        </div>
                        <input type="number" class="form-control" id="Verkehr von N <--> S  " aria-describedby="basic-addon3" value="10">
                    </div>
                </div>
                <div class="row">
                    <label for="Verkehr von N <--> O  ">Verkehr von N <--> O  </label>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Fahrzeuge pro Minute</span>
                        </div>
                        <input type="number" class="form-control" id="Verkehr von N <--> O  " aria-describedby="basic-addon3" value="10">
                    </div>
                </div>
                <div class="row">
                    <label for="Verkehr von N <--> W  ">Verkehr von N <--> W  </label>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Fahrzeuge pro Minute</span>
                        </div>
                        <input type="number" class="form-control" id="Verkehr von N <--> W  " aria-describedby="basic-addon3" value="10">
                    </div>
                </div>
                <div class="row">
                    <label for="Verkehr von S <--> O  ">Verkehr von S <--> O  </label>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Fahrzeuge pro Minute</span>
                        </div>
                        <input type="number" class="form-control" id="Verkehr von S <--> O  " aria-describedby="basic-addon3" value="10">
                    </div>
                </div>
                <div class="row">
                    <label for="Verkehr von S <--> W  ">Verkehr von S <--> W  </label>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Fahrzeuge pro Minute</span>
                        </div>
                        <input type="number" class="form-control" id="Verkehr von S <--> W  " aria-describedby="basic-addon3" value="10">
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>