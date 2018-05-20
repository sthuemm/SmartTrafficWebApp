package de.htwg.smarttraffic.model;

import java.util.HashMap;
import java.util.Map;

public class Casestudy {

    private static final Casestudy instance = new Casestudy();

    private Map<String, Intersection> intersectionMap;

    private Casestudy(){
        this.intersectionMap = new HashMap<>();
        Intersection k1 = new Intersection(Intersection.IntersectionType.WNO);
        Intersection k2 = new Intersection(Intersection.IntersectionType.WNOS);
        Intersection k3 = new Intersection(Intersection.IntersectionType.WNO);

        intersectionMap.put("K1", k1);
        intersectionMap.put("K2", k2);
        intersectionMap.put("K3", k3);
    }

    public static Casestudy getInstance(){
        return instance;
    }

    public Map<String, Intersection> getIntersectionMap() {
        return intersectionMap;
    }

    public void setIntersectionMap(Map<String, Intersection> intersectionMap) {
        this.intersectionMap = intersectionMap;
    }
}
