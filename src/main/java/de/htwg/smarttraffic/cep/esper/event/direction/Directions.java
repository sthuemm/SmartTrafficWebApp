package de.htwg.smarttraffic.cep.esper.event.direction;

import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;


public class Directions {

    public static void setDirectionsK1AccidentK2Occurs(){
        Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");

        TrafficLight trafficLightWtoO = new TrafficLight("wtoO", "W <--> O", "up", true);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS", "W <--> O", "down", true);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN", "W <--> O", "up", true);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO", "W <--> O", "left", true);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS", "W <--> O", "down", true);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left", false);
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN", "W <--> O", "left", true);

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","up", false);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","down", false);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","W <--> O","left", false);
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up", false);

        TrafficLight trafficLightStoO = new TrafficLight("stoO","W <--> O", "up", true);
        TrafficLight trafficLightStoW = new TrafficLight("stoW","W <--> O","left", false);
        TrafficLight trafficLightStoN = new TrafficLight("stoN","W <--> O", "up", true);
        TrafficLight trafficLightStoS = new TrafficLight("stoS","W <--> O", "left", true);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right", false);
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up", false);

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","right", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","right", false);

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","up", false);
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","down", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up", false);

        TrafficLight trafficLightStoORtw = new TrafficLight("stoORtw","W <--> O","right", false);
        TrafficLight trafficLightStoWRtw = new TrafficLight("stoWRtw","W <--> O","left", false);
        TrafficLight trafficLightStoNRtw = new TrafficLight("stoNRtw","W <--> O","right", false);
        TrafficLight trafficLightStoSRtw = new TrafficLight("stoSRtw","W <--> O","right", false);

        intersectionk1.getTrafficLights().put(trafficLightWtoO.getId(), trafficLightWtoO);
        intersectionk1.getTrafficLights().put(trafficLightWtoS.getId(), trafficLightWtoS);
        intersectionk1.getTrafficLights().put(trafficLightWtoN.getId(), trafficLightWtoN);
        intersectionk1.getTrafficLights().put(trafficLightWtoW.getId(), trafficLightWtoW);

        intersectionk1.getTrafficLights().put(trafficLightNtoO.getId(), trafficLightNtoO);
        intersectionk1.getTrafficLights().put(trafficLightNtoS.getId(), trafficLightNtoS);
        intersectionk1.getTrafficLights().put(trafficLightNtoW.getId(), trafficLightNtoW);
        intersectionk1.getTrafficLights().put(trafficLightNtoN.getId(), trafficLightNtoN);

        intersectionk1.getTrafficLights().put(trafficLightOtoN.getId(), trafficLightOtoN);
        intersectionk1.getTrafficLights().put(trafficLightOtoS.getId(), trafficLightOtoS);
        intersectionk1.getTrafficLights().put(trafficLightOtoW.getId(), trafficLightOtoW);
        intersectionk1.getTrafficLights().put(trafficLightOtoO.getId(), trafficLightOtoO);

        intersectionk1.getTrafficLights().put(trafficLightStoO.getId(), trafficLightStoO);
        intersectionk1.getTrafficLights().put(trafficLightStoW.getId(), trafficLightStoW);
        intersectionk1.getTrafficLights().put(trafficLightStoN.getId(), trafficLightStoN);
        intersectionk1.getTrafficLights().put(trafficLightStoS.getId(), trafficLightStoS);

        intersectionk1.getTrafficLights().put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        intersectionk1.getTrafficLights().put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        intersectionk1.getTrafficLights().put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        intersectionk1.getTrafficLights().put(trafficLightStoORtw.getId(), trafficLightStoORtw);
        intersectionk1.getTrafficLights().put(trafficLightStoWRtw.getId(), trafficLightStoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightStoNRtw.getId(), trafficLightStoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightStoSRtw.getId(), trafficLightStoSRtw);

        Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);
    }

    public static void setDirectionsK3AccidentK2Occurs(){
        Intersection intersectionk3 = Casestudy.getInstance().getIntersectionMap().get("k3");

        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","up", false);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS", "W <--> O", "right", true);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW", "W <--> O", "right", true);
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN", "W <--> O", "right", true);

        TrafficLight trafficLightOtoN = new TrafficLight("otoN", "W <--> O", "up", true);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS", "W <--> O", "up", true);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW", "W <--> O", "up", true);
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up", false);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right", false);
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","up", false);
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up", false);

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","left", false);

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up", false);

        intersectionk3.getTrafficLights().put(trafficLightWtoO.getId(), trafficLightWtoO);
        intersectionk3.getTrafficLights().put(trafficLightWtoS.getId(), trafficLightWtoS);
        intersectionk3.getTrafficLights().put(trafficLightWtoN.getId(), trafficLightWtoN);
        intersectionk3.getTrafficLights().put(trafficLightWtoW.getId(), trafficLightWtoW);

        intersectionk3.getTrafficLights().put(trafficLightNtoO.getId(), trafficLightNtoO);
        intersectionk3.getTrafficLights().put(trafficLightNtoS.getId(), trafficLightNtoS);
        intersectionk3.getTrafficLights().put(trafficLightNtoW.getId(), trafficLightNtoW);
        intersectionk3.getTrafficLights().put(trafficLightNtoN.getId(), trafficLightNtoN);

        intersectionk3.getTrafficLights().put(trafficLightOtoN.getId(), trafficLightOtoN);
        intersectionk3.getTrafficLights().put(trafficLightOtoS.getId(), trafficLightOtoS);
        intersectionk3.getTrafficLights().put(trafficLightOtoW.getId(), trafficLightOtoW);
        intersectionk3.getTrafficLights().put(trafficLightOtoO.getId(), trafficLightOtoO);

        intersectionk3.getTrafficLights().put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        intersectionk3.getTrafficLights().put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        intersectionk3.getTrafficLights().put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        Casestudy.getInstance().getIntersectionMap().put("k3", intersectionk3);
    }

    public static void setDirectionsK1NoIncident(){
        Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");

        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","right", false);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","right", false);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left", false);
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN","W <--> O","right", false);

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","up", false);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","down", false);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","W <--> O","left", false);
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up", false);

        TrafficLight trafficLightStoO = new TrafficLight("stoO","W <--> O","right", false);
        TrafficLight trafficLightStoW = new TrafficLight("stoW","W <--> O","left", false);
        TrafficLight trafficLightStoN = new TrafficLight("stoN","W <--> O","right", false);
        TrafficLight trafficLightStoS = new TrafficLight("stoS","W <--> O","right", false);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right", false);
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up", false);

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","right", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","right", false);

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","up", false);
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","down", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up", false);

        TrafficLight trafficLightStoORtw = new TrafficLight("stoORtw","W <--> O","right", false);
        TrafficLight trafficLightStoWRtw = new TrafficLight("stoWRtw","W <--> O","left", false);
        TrafficLight trafficLightStoNRtw = new TrafficLight("stoNRtw","W <--> O","right", false);
        TrafficLight trafficLightStoSRtw = new TrafficLight("stoSRtw","W <--> O","right", false);

        intersectionk1.getTrafficLights().put(trafficLightWtoO.getId(), trafficLightWtoO);
        intersectionk1.getTrafficLights().put(trafficLightWtoS.getId(), trafficLightWtoS);
        intersectionk1.getTrafficLights().put(trafficLightWtoN.getId(), trafficLightWtoN);
        intersectionk1.getTrafficLights().put(trafficLightWtoW.getId(), trafficLightWtoW);

        intersectionk1.getTrafficLights().put(trafficLightNtoO.getId(), trafficLightNtoO);
        intersectionk1.getTrafficLights().put(trafficLightNtoS.getId(), trafficLightNtoS);
        intersectionk1.getTrafficLights().put(trafficLightNtoW.getId(), trafficLightNtoW);
        intersectionk1.getTrafficLights().put(trafficLightNtoN.getId(), trafficLightNtoN);

        intersectionk1.getTrafficLights().put(trafficLightOtoN.getId(), trafficLightOtoN);
        intersectionk1.getTrafficLights().put(trafficLightOtoS.getId(), trafficLightOtoS);
        intersectionk1.getTrafficLights().put(trafficLightOtoW.getId(), trafficLightOtoW);
        intersectionk1.getTrafficLights().put(trafficLightOtoO.getId(), trafficLightOtoO);

        intersectionk1.getTrafficLights().put(trafficLightStoO.getId(), trafficLightStoO);
        intersectionk1.getTrafficLights().put(trafficLightStoW.getId(), trafficLightStoW);
        intersectionk1.getTrafficLights().put(trafficLightStoN.getId(), trafficLightStoN);
        intersectionk1.getTrafficLights().put(trafficLightStoS.getId(), trafficLightStoS);

        intersectionk1.getTrafficLights().put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        intersectionk1.getTrafficLights().put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        intersectionk1.getTrafficLights().put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        intersectionk1.getTrafficLights().put(trafficLightStoORtw.getId(), trafficLightStoORtw);
        intersectionk1.getTrafficLights().put(trafficLightStoWRtw.getId(), trafficLightStoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightStoNRtw.getId(), trafficLightStoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightStoSRtw.getId(), trafficLightStoSRtw);

        Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);


    }

    public static void setDirectionsK3NoIncident(){

        Intersection intersectionk3 = Casestudy.getInstance().getIntersectionMap().get("k3");

        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","up", false);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","left", false);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left", false);
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN","W <--> O","left", false);

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","left", false);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","left", false);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","W <--> O","left", false);
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up", false);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right", false);
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","up", false);
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up", false);

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","left", false);

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up", false);

        intersectionk3.getTrafficLights().put(trafficLightWtoO.getId(), trafficLightWtoO);
        intersectionk3.getTrafficLights().put(trafficLightWtoS.getId(), trafficLightWtoS);
        intersectionk3.getTrafficLights().put(trafficLightWtoN.getId(), trafficLightWtoN);
        intersectionk3.getTrafficLights().put(trafficLightWtoW.getId(), trafficLightWtoW);

        intersectionk3.getTrafficLights().put(trafficLightNtoO.getId(), trafficLightNtoO);
        intersectionk3.getTrafficLights().put(trafficLightNtoS.getId(), trafficLightNtoS);
        intersectionk3.getTrafficLights().put(trafficLightNtoW.getId(), trafficLightNtoW);
        intersectionk3.getTrafficLights().put(trafficLightNtoN.getId(), trafficLightNtoN);

        intersectionk3.getTrafficLights().put(trafficLightOtoN.getId(), trafficLightOtoN);
        intersectionk3.getTrafficLights().put(trafficLightOtoS.getId(), trafficLightOtoS);
        intersectionk3.getTrafficLights().put(trafficLightOtoW.getId(), trafficLightOtoW);
        intersectionk3.getTrafficLights().put(trafficLightOtoO.getId(), trafficLightOtoO);

        intersectionk3.getTrafficLights().put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        intersectionk3.getTrafficLights().put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        intersectionk3.getTrafficLights().put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        Casestudy.getInstance().getIntersectionMap().put("k3", intersectionk3);
    }

    public static void setDirectionsK1BarrierS1Closed(){
        Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");

        TrafficLight trafficLightWtoO = new TrafficLight("wtoO", "W <--> O", "up", true);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","right", false);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","right", false);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left", false);
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN","W <--> O","right", false);

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","up", false);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","down", false);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","W <--> O","left", false);
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up", false);

        TrafficLight trafficLightStoO = new TrafficLight("stoO", "W <--> O", "up", true);
        TrafficLight trafficLightStoW = new TrafficLight("stoW","W <--> O","left", false);
        TrafficLight trafficLightStoN = new TrafficLight("stoN","W <--> O","right", false);
        TrafficLight trafficLightStoS = new TrafficLight("stoS","W <--> O","right", false);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw", "W <--> O", "up", true);
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up", false);

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","right", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","right", false);

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","up", false);
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","down", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up", false);

        TrafficLight trafficLightStoORtw = new TrafficLight("stoORtw", "W <--> O", "up", true);
        TrafficLight trafficLightStoWRtw = new TrafficLight("stoWRtw","W <--> O","left", false);
        TrafficLight trafficLightStoNRtw = new TrafficLight("stoNRtw","W <--> O","right", false);
        TrafficLight trafficLightStoSRtw = new TrafficLight("stoSRtw","W <--> O","right", false);

        intersectionk1.getTrafficLights().put(trafficLightWtoO.getId(), trafficLightWtoO);
        intersectionk1.getTrafficLights().put(trafficLightWtoS.getId(), trafficLightWtoS);
        intersectionk1.getTrafficLights().put(trafficLightWtoN.getId(), trafficLightWtoN);
        intersectionk1.getTrafficLights().put(trafficLightWtoW.getId(), trafficLightWtoW);

        intersectionk1.getTrafficLights().put(trafficLightNtoO.getId(), trafficLightNtoO);
        intersectionk1.getTrafficLights().put(trafficLightNtoS.getId(), trafficLightNtoS);
        intersectionk1.getTrafficLights().put(trafficLightNtoW.getId(), trafficLightNtoW);
        intersectionk1.getTrafficLights().put(trafficLightNtoN.getId(), trafficLightNtoN);

        intersectionk1.getTrafficLights().put(trafficLightOtoN.getId(), trafficLightOtoN);
        intersectionk1.getTrafficLights().put(trafficLightOtoS.getId(), trafficLightOtoS);
        intersectionk1.getTrafficLights().put(trafficLightOtoW.getId(), trafficLightOtoW);
        intersectionk1.getTrafficLights().put(trafficLightOtoO.getId(), trafficLightOtoO);

        intersectionk1.getTrafficLights().put(trafficLightStoO.getId(), trafficLightStoO);
        intersectionk1.getTrafficLights().put(trafficLightStoW.getId(), trafficLightStoW);
        intersectionk1.getTrafficLights().put(trafficLightStoN.getId(), trafficLightStoN);
        intersectionk1.getTrafficLights().put(trafficLightStoS.getId(), trafficLightStoS);

        intersectionk1.getTrafficLights().put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        intersectionk1.getTrafficLights().put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        intersectionk1.getTrafficLights().put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        intersectionk1.getTrafficLights().put(trafficLightStoORtw.getId(), trafficLightStoORtw);
        intersectionk1.getTrafficLights().put(trafficLightStoWRtw.getId(), trafficLightStoWRtw);
        intersectionk1.getTrafficLights().put(trafficLightStoNRtw.getId(), trafficLightStoNRtw);
        intersectionk1.getTrafficLights().put(trafficLightStoSRtw.getId(), trafficLightStoSRtw);

        Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);


    }

    public static void setDirectionsK3BarrierS1Closed(){

        Intersection intersectionk3 = Casestudy.getInstance().getIntersectionMap().get("k3");

        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","up", false);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","left", false);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left", false);
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN","W <--> O","left", false);

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","left", false);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","left", false);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW", "W <--> O", "up", true);
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up", false);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right", false);
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","up", false);
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up", false);

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","left", false);

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","left", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw", "W <--> O", "up", true);
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up", false);

        intersectionk3.getTrafficLights().put(trafficLightWtoO.getId(), trafficLightWtoO);
        intersectionk3.getTrafficLights().put(trafficLightWtoS.getId(), trafficLightWtoS);
        intersectionk3.getTrafficLights().put(trafficLightWtoN.getId(), trafficLightWtoN);
        intersectionk3.getTrafficLights().put(trafficLightWtoW.getId(), trafficLightWtoW);

        intersectionk3.getTrafficLights().put(trafficLightNtoO.getId(), trafficLightNtoO);
        intersectionk3.getTrafficLights().put(trafficLightNtoS.getId(), trafficLightNtoS);
        intersectionk3.getTrafficLights().put(trafficLightNtoW.getId(), trafficLightNtoW);
        intersectionk3.getTrafficLights().put(trafficLightNtoN.getId(), trafficLightNtoN);

        intersectionk3.getTrafficLights().put(trafficLightOtoN.getId(), trafficLightOtoN);
        intersectionk3.getTrafficLights().put(trafficLightOtoS.getId(), trafficLightOtoS);
        intersectionk3.getTrafficLights().put(trafficLightOtoW.getId(), trafficLightOtoW);
        intersectionk3.getTrafficLights().put(trafficLightOtoO.getId(), trafficLightOtoO);

        intersectionk3.getTrafficLights().put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        intersectionk3.getTrafficLights().put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        intersectionk3.getTrafficLights().put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        intersectionk3.getTrafficLights().put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        intersectionk3.getTrafficLights().put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        intersectionk3.getTrafficLights().put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        Casestudy.getInstance().getIntersectionMap().put("k3", intersectionk3);
    }


}
