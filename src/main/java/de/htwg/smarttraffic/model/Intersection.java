package de.htwg.smarttraffic.model;

import java.util.HashMap;
import java.util.Map;

public class Intersection {

    public enum IntersectionType {
        WNO, WSO, WNOS
    }

    private Map<String, TrafficLight> trafficLights;


    public Intersection(IntersectionType type){
        trafficLights = new HashMap<>();
        if ( type == IntersectionType.WNO){
            setTrafficLightsForK3();
//        } else if (type == IntersectionType.WSO){
//            setTrafficLightsForWSO();
        } else if (type == IntersectionType.WNOS){
            setTrafficLightsForK1();
        }
    }

    private void setTrafficLightsForWNO(){
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right");
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> N","up");
        TrafficLight trafficLightOtoN = new TrafficLight("otoN","O <--> N","up");
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","O <--> N","left");
        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right");
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left");

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right");
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> N","up");
        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","O <--> N","up");
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","O <--> N","left");
        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right");
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left");

        trafficLights.put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        trafficLights.put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        trafficLights.put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        trafficLights.put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        trafficLights.put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        trafficLights.put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);

        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
        trafficLights.put(trafficLightWtoN.getId(), trafficLightWtoN);
        trafficLights.put(trafficLightOtoN.getId(), trafficLightOtoN);
        trafficLights.put(trafficLightOtoW.getId(), trafficLightOtoW);
        trafficLights.put(trafficLightNtoO.getId(), trafficLightNtoO);
        trafficLights.put(trafficLightNtoW.getId(), trafficLightNtoW);
    }

//    private void setTrafficLightsForWSO(){
//        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O",2);
//        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> S",2);
//        TrafficLight trafficLightOtoS = new TrafficLight("otoS","O <--> S",2);
//        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
//        trafficLights.put(trafficLightWtoS.getId(), trafficLightWtoS);
//        trafficLights.put(trafficLightOtoS.getId(), trafficLightOtoS);
//    }

    private void setTrafficLightsForK1(){
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right");
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right");
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","right");
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up");

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right");
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","down");
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left");
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN","W <--> O","right");

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","up");
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","down");
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","W <--> O","left");
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up");

        TrafficLight trafficLightStoO = new TrafficLight("stoO","W <--> O","right");
        TrafficLight trafficLightStoW = new TrafficLight("stoW","W <--> O","left");
        TrafficLight trafficLightStoN = new TrafficLight("stoN","W <--> O","right");
        TrafficLight trafficLightStoS = new TrafficLight("stoS","W <--> O","right");

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right");
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","right");
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","right");
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up");

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right");
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","down");
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left");
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","right");

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","up");
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","down");
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left");
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up");

        TrafficLight trafficLightStoORtw = new TrafficLight("stoORtw","W <--> O","right");
        TrafficLight trafficLightStoWRtw = new TrafficLight("stoWRtw","W <--> O","left");
        TrafficLight trafficLightStoNRtw = new TrafficLight("stoNRtw","W <--> O","right");
        TrafficLight trafficLightStoSRtw = new TrafficLight("stoSRtw","W <--> O","right");

        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
        trafficLights.put(trafficLightWtoS.getId(), trafficLightWtoS);
        trafficLights.put(trafficLightWtoN.getId(), trafficLightWtoN);
        trafficLights.put(trafficLightWtoW.getId(), trafficLightWtoW);

        trafficLights.put(trafficLightNtoO.getId(), trafficLightNtoO);
        trafficLights.put(trafficLightNtoS.getId(), trafficLightNtoS);
        trafficLights.put(trafficLightNtoW.getId(), trafficLightNtoW);
        trafficLights.put(trafficLightNtoN.getId(), trafficLightNtoN);

        trafficLights.put(trafficLightOtoN.getId(), trafficLightOtoN);
        trafficLights.put(trafficLightOtoS.getId(), trafficLightOtoS);
        trafficLights.put(trafficLightOtoW.getId(), trafficLightOtoW);
        trafficLights.put(trafficLightOtoO.getId(), trafficLightOtoO);

        trafficLights.put(trafficLightStoO.getId(), trafficLightStoO);
        trafficLights.put(trafficLightStoW.getId(), trafficLightStoW);
        trafficLights.put(trafficLightStoN.getId(), trafficLightStoN);
        trafficLights.put(trafficLightStoS.getId(), trafficLightStoS);

        trafficLights.put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        trafficLights.put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        trafficLights.put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        trafficLights.put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        trafficLights.put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        trafficLights.put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        trafficLights.put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        trafficLights.put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        trafficLights.put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        trafficLights.put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        trafficLights.put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        trafficLights.put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);

        trafficLights.put(trafficLightStoORtw.getId(), trafficLightStoORtw);
        trafficLights.put(trafficLightStoWRtw.getId(), trafficLightStoWRtw);
        trafficLights.put(trafficLightStoNRtw.getId(), trafficLightStoNRtw);
        trafficLights.put(trafficLightStoSRtw.getId(), trafficLightStoSRtw);
    }

    private void setTrafficLightsForK3(){
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right");
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","up");
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","up");
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up");

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right");
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","left");
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left");
        TrafficLight trafficLightNtoN = new TrafficLight("ntoN","W <--> O","left");

        TrafficLight trafficLightOtoN = new TrafficLight("otoN","W <--> O","left");
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","W <--> O","left");
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","W <--> O","left");
        TrafficLight trafficLightOtoO = new TrafficLight("otoO","W <--> O","up");

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right");
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","up");
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> O","up");
        TrafficLight trafficLightWtoWRtw = new TrafficLight("wtoWRtw","W <--> O","up");

        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right");
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","left");
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left");
        TrafficLight trafficLightNtoNRtw = new TrafficLight("ntoNRtw","W <--> O","left");

        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","W <--> O","left");
        TrafficLight trafficLightOtoSRtw = new TrafficLight("otoSRtw","W <--> O","left");
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","W <--> O","left");
        TrafficLight trafficLightOtoORtw = new TrafficLight("otoORtw","W <--> O","up");



        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
        trafficLights.put(trafficLightWtoS.getId(), trafficLightWtoS);
        trafficLights.put(trafficLightWtoN.getId(), trafficLightWtoN);
        trafficLights.put(trafficLightWtoW.getId(), trafficLightWtoW);

        trafficLights.put(trafficLightNtoO.getId(), trafficLightNtoO);
        trafficLights.put(trafficLightNtoS.getId(), trafficLightNtoS);
        trafficLights.put(trafficLightNtoW.getId(), trafficLightNtoW);
        trafficLights.put(trafficLightNtoN.getId(), trafficLightNtoN);

        trafficLights.put(trafficLightOtoN.getId(), trafficLightOtoN);
        trafficLights.put(trafficLightOtoS.getId(), trafficLightOtoS);
        trafficLights.put(trafficLightOtoW.getId(), trafficLightOtoW);
        trafficLights.put(trafficLightOtoO.getId(), trafficLightOtoO);

        trafficLights.put(trafficLightWtoORtw.getId(), trafficLightWtoORtw);
        trafficLights.put(trafficLightWtoSRtw.getId(), trafficLightWtoSRtw);
        trafficLights.put(trafficLightWtoNRtw.getId(), trafficLightWtoNRtw);
        trafficLights.put(trafficLightWtoWRtw.getId(), trafficLightWtoWRtw);

        trafficLights.put(trafficLightNtoORtw.getId(), trafficLightNtoORtw);
        trafficLights.put(trafficLightNtoSRtw.getId(), trafficLightNtoSRtw);
        trafficLights.put(trafficLightNtoWRtw.getId(), trafficLightNtoWRtw);
        trafficLights.put(trafficLightNtoNRtw.getId(), trafficLightNtoNRtw);

        trafficLights.put(trafficLightOtoNRtw.getId(), trafficLightOtoNRtw);
        trafficLights.put(trafficLightOtoSRtw.getId(), trafficLightOtoSRtw);
        trafficLights.put(trafficLightOtoWRtw.getId(), trafficLightOtoWRtw);
        trafficLights.put(trafficLightOtoORtw.getId(), trafficLightOtoORtw);
    }

    public Map<String, TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public void setTrafficLights(Map<String, TrafficLight> trafficLights) {
        this.trafficLights = trafficLights;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "trafficLights=" + trafficLights +
                '}';
    }
}
