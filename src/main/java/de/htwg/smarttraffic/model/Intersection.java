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
            setTrafficLightsForWNO();
        } else if (type == IntersectionType.WSO){
            setTrafficLightsForWSO();
        } else if (type == IntersectionType.WNOS){
            setTrafficLightsForWNOS();
        }
    }

    private void setTrafficLightsForWNO(){
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O",2);
        TrafficLight trafficLightWtoN = new TrafficLight("wtoN","W <--> N",2);
        TrafficLight trafficLightOtoN = new TrafficLight("otoN","O <--> N",2);
        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
        trafficLights.put(trafficLightWtoN.getId(), trafficLightWtoN);
        trafficLights.put(trafficLightOtoN.getId(), trafficLightOtoN);
    }

    private void setTrafficLightsForWSO(){
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O",2);
        TrafficLight trafficLightWtoS = new TrafficLight("wtoS","W <--> S",2);
        TrafficLight trafficLightOtoS = new TrafficLight("otoS","O <--> S",2);
        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
        trafficLights.put(trafficLightWtoS.getId(), trafficLightWtoS);
        trafficLights.put(trafficLightOtoS.getId(), trafficLightOtoS);
    }

    private void setTrafficLightsForWNOS(){
        TrafficLight trafficLightWtoO = new TrafficLight("wtoO","W <--> O",2);
        TrafficLight trafficLightWtoNOtoS = new TrafficLight("wtoNOtoS","W <--> N / O <--> S",2);
        TrafficLight trafficLightStoN = new TrafficLight("stoN","S <--> N",2);
        trafficLights.put(trafficLightWtoO.getId(), trafficLightWtoO);
        trafficLights.put(trafficLightWtoNOtoS.getId(), trafficLightWtoNOtoS);
        trafficLights.put(trafficLightStoN.getId(), trafficLightStoN);
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
