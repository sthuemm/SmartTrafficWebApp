package de.htwg.smarttraffic.model;

import java.util.HashMap;
import java.util.Map;

public class Intersection {

    public enum IntersectionType {
        WNO, WSO, WNOS
    }

    private Map<String, Integer> trafficLights;


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
        trafficLights.put("W <--> O", 2);
        trafficLights.put("W <--> N", 2);
        trafficLights.put("O <--> N", 2);
    }

    private void setTrafficLightsForWSO(){
        trafficLights.put("W <--> O", 2);
        trafficLights.put("W <--> S", 2);
        trafficLights.put("O <--> S", 2);
    }

    private void setTrafficLightsForWNOS(){
        trafficLights.put("W <--> O", 2);
        trafficLights.put("W <--> N / O <--> S", 2);
        trafficLights.put("S <--> N", 2);
    }

    public Map<String, Integer> getTrafficLights() {
        return trafficLights;
    }

    public void setTrafficLights(Map<String, Integer> trafficLights) {
        this.trafficLights = trafficLights;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "trafficLights=" + trafficLights +
                '}';
    }
}
