<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Smart Traffic with Complex Event Processing engine Esper</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

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
                            <th scope="col">Dauer Grünphase (Minuten)</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="intersection" items="${intersections}">
                        <tr>
                            <td scope="row"><c:out value="${intersection.key}"/></td>
                            <c:set var="trafficlights" value="${intersection.value.trafficLights}"/>
                            <c:forEach var="trafficLight" items="${trafficlights}">
                                <tr>
                                    <td></td>
                                    <td><c:out value="${trafficLight.key}"/></td>
                                    <td><c:out value="${trafficLight.value}"/></td>
                                </tr>
                            </c:forEach>
                        </tr>
                        </c:forEach>
                    </tbody>


                </table>
            </div>
            <div class="col">
                <h3>Ereignisse auslösen</h3>
                <br>
                <div class="row">
                    <button type="button" class="btn btn-warning">Bahnschranke runter</button>
                </div>
                <div class="row">
                    <button type="button" class="btn btn-success">Bahnschranke hoch</button>
                </div>
                <br>
                <div class="row">
                    <button type="button" class="btn btn-danger">Unfall an K2 passiert</button>
                </div>u
                <div class="row">
                    <button type="button" class="btn btn-success">Unfall an K2 beendet</button>
                </div>
                <br>
                <div class="row">
                    <button type="button" class="btn btn-warning">Stickoxidwerte an K2 zu hoch</button>
                </div>
                <div class="row">
                    <button type="button" class="btn btn-success">Stickoxidwerte an K2 normal</button>
                </div>
            </div>
            <div class="col">
                <h3>Ereignissströme</h3>
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