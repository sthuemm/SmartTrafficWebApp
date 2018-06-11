<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Smart Traffic with Complex Event Processing engine Esper</title>

    <link href="css/switchButton.css" rel="stylesheet">
    <link href="css/design.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>

    <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery-toggles/2.0.4/toggles.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-toggles/2.0.4/toggles.min.js"></script>



    <script src="js/cepResults.js"></script>
    <script src="js/design.js"></script>

</head>
<body id="home_body">
    <div>
        <br>
        <table class="table-sm table-bordered" id="k1fromEast">
            <thead>
                <tr>
                    <th scope="col">Richtung</th>
                    <th scope="col">Route</th>
                    <th scope="col">Rtw</th>
                </tr>
            </thead>
            <tbody>

                <tr>
                    <td>Nord</td>
                    <td id="k1otoN"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                    <td id="k1otoNRtw"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Sued</td>
                    <td id="k1otoS"><i class="fa fa-arrow-down" style="font-size:24px"></i></td>
                    <td id="k1otoSRtw"><i class="fa fa-arrow-down" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>West</td>
                    <td id="k1otoW"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k1otoWRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Ost</td>
                    <td id="k1otoO"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k1otoORtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>

            </tbody>
        </table>
        <table class="table-sm table-bordered" id="k1fromNorth">
            <thead>
            <tr>
                <th scope="col">Richtung</th>
                <th scope="col">Route</th>
                <th scope="col">Rtw</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Ost</td>
                    <td id="k1ntoO"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                    <td id="k1ntoORtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Sued</td>
                    <td id="k1ntoS"><i class="fa fa-arrow-down" style="font-size:24px"></i></td>
                    <td id="k1ntoSRtw"><i class="fa fa-arrow-down" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>West</td>
                    <td id="k1ntoW"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k1ntoWRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Nord</td>
                    <td id="k1ntoN"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k1ntoNRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
            </tbody>
        </table>
        <table class="table-sm table-bordered" id="k1fromWest">
            <thead>
            <tr>
                <th scope="col">Richtung</th>
                <th scope="col">Route</th>
                <th scope="col">Rtw</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Nord</td>
                    <td id="k1wtoN"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                    <td id="k1wtoNRtw"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Sued</td>
                    <td id="k1wtoS"><i class="fa fa-arrow-down" style="font-size:24px"></i></td>
                    <td id="k1wtoSRtw"><i class="fa fa-arrow-down" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Ost</td>
                    <td id="k1wtoO"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                    <td id="k1wtoORtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>West</td>
                    <td id="k1wtoW"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                    <td id="k1wtoWRtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                </tr>
            </tbody>
        </table>
        <table class="table-sm table-bordered" id="k1fromSouth">
            <thead>
            <tr>
                <th scope="col">Richtung</th>
                <th scope="col">Route</th>
                <th scope="col">Rtw</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Nord</td>
                    <td id="k1stoN"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                    <td id="k1stoNRtw"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Ost</td>
                    <td id="k1stoO"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                    <td id="k1stoORtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>West</td>
                    <td id="k1stoW"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k1stoWRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Sued</td>
                    <td id="k1stoS"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k1stoSRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
            </tbody>
        </table>
        <table class="table-sm table-bordered" id="k3fromEast">
            <thead>
            <tr>
                <th scope="col">Richtung</th>
                <th scope="col">Route</th>
                <th scope="col">Rtw</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Nord</td>
                    <td id="k3otoN"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                    <td id="k3otoNRtw"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>West</td>
                    <td id="k3otoW"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k3otoWRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Sued</td>
                    <td id="k3otoS"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k3otoSRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
                <tr>
                    <td>Ost</td>
                    <td id="k3otoO"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                    <td id="k3otoORtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                </tr>
            </tbody>
        </table>
        <table class="table-sm table-bordered" id="k3fromNorth">
            <thead>
            <tr>
                <th scope="col">Richtung</th>
                <th scope="col">Route</th>
                <th scope="col">Rtw</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>West</td>
                <td id="k3ntoW"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
                <td id="k3ntoWRtw"><i class="fa fa-arrow-left" style="font-size:24px"></i></td>
            </tr>
            <tr>
                <td>Ost</td>
                <td id="k3ntoO"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                <td id="k3ntoORtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
            </tr>
            <tr>
                <td>Nord</td>
                <td id="k3ntoN"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                <td id="k3ntoNRtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
            </tr>
            <tr>
                <td>Sued</td>
                <td id="k3ntoS"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                <td id="k3ntoSRtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
            </tr>
            </tbody>
        </table>
        <table class="table-sm table-bordered" id="k3fromWest">
            <thead>
            <tr>
                <th scope="col">Richtung</th>
                <th scope="col">Route</th>
                <th scope="col">Rtw</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Nord</td>
                <td id="k3wtoN"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
                <td id="k3wtoNRtw"><i class="fa fa-arrow-up" style="font-size:24px"></i></td>
            </tr>
            <tr>
                <td>Ost</td>
                <td id="k3wtoO"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                <td id="k3wtoORtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
            </tr>
            <tr>
                <td>West</td>
                <td id="k3wtoW"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                <td id="k3wtoWRtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
            </tr>
            <tr>
                <td>Sued</td>
                <td id="k3wtoS"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
                <td id="k3wtoSRtw"><i class="fa fa-arrow-right" style="font-size:24px"></i></td>
            </tr>
            </tbody>
        </table>

    </div>
</body>
</html>