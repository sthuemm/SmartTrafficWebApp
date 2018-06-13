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
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> N","up", false);
        TrafficLight trafficLightOtoN = new TrafficLight("otoN","O <--> N","up", false);
        TrafficLight trafficLightOtoW = new TrafficLight("otoW","O <--> N","left", false);
        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoW = new TrafficLight("ntoW","W <--> O","left", false);

        TrafficLight trafficLightWtoORtw = new TrafficLight("wtoORtw","W <--> O","right", false);
        TrafficLight trafficLightWtoNRtw = new TrafficLight("wtoNRtw","W <--> N","up", false);
        TrafficLight trafficLightOtoNRtw = new TrafficLight("otoNRtw","O <--> N","up", false);
        TrafficLight trafficLightOtoWRtw = new TrafficLight("otoWRtw","O <--> N","left", false);
        TrafficLight trafficLightNtoORtw = new TrafficLight("ntoORtw","W <--> O","right", false);
        TrafficLight trafficLightNtoWRtw = new TrafficLight("ntoWRtw","W <--> O","left", false);

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
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","right", false);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> O","right", false);
        TrafficLight trafficLightWtoW = new TrafficLight("wtoW","W <--> O","up", false);

        TrafficLight trafficLightNtoO = new TrafficLight("ntoO","W <--> O","right", false);
        TrafficLight trafficLightNtoS = new TrafficLight("ntoS","W <--> O","down", false);
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
        TrafficLight trafficLightNtoSRtw = new TrafficLight("ntoSRtw","W <--> O","down", false);
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
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O","right", false);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> O","up", false);
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
        TrafficLight trafficLightWtoSRtw = new TrafficLight("wtoSRtw","W <--> O","up", false);
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
