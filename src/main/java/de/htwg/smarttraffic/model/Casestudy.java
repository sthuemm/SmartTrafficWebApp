package de.htwg.smarttraffic.model;

import com.espertech.esper.client.EPStatement;

import de.htwg.smarttraffic.cep.esper.EsperRuntime;
import de.htwg.smarttraffic.cep.esper.EsperServiceProvider;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Casestudy {

    private static Casestudy instance;

    private Map<String, Intersection> intersectionMap;

    private EventStream eventStream;



    @Resource
    EsperRuntime esperRuntime;

    private Casestudy(){
        this.intersectionMap = new HashMap<>();
        Intersection k1 = new Intersection(Intersection.IntersectionType.WNO);
        Intersection k2 = new Intersection(Intersection.IntersectionType.WNOS);
        Intersection k3 = new Intersection(Intersection.IntersectionType.WNO);

        intersectionMap.put("K1", k1);
        intersectionMap.put("K2", k2);
        intersectionMap.put("K3", k3);

        this.eventStream = new EventStream(esperRuntime);
        setStatements();
    }

    public static Casestudy getInstance(){
        if(instance == null){
            instance = new Casestudy();
        }
        return instance;
    }

    public Map<String, Intersection> getIntersectionMap() {
        return intersectionMap;
    }

    public void setIntersectionMap(Map<String, Intersection> intersectionMap) {
        this.intersectionMap = intersectionMap;
    }

    private void setStatements(){
        EPStatement barrierCloseStatement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select railwayCrossing from RailroadCrossingBarrierCloseEvent");
        barrierCloseStatement.addListener((newEvents, oldEvents) -> {
            System.out.println("RailroadCrossingBarrierCloseEvent: " + newEvents[0].getUnderlying());

            Intersection intersection = getInstance().getIntersectionMap().get("K3");
            intersection.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", 0));
            getInstance().getIntersectionMap().put("K3", intersection);
            System.out.println("Kreuzungen:" +getInstance().getIntersectionMap().get("K3"));
        });

        EPStatement barrierOpenStatement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select railwayCrossing from RailroadCrossingBarrierOpenEvent");
        barrierOpenStatement.addListener((newEvents, oldEvents) -> {
            System.out.println("RailroadCrossingBarrierOpenEvent: " + newEvents[0].getUnderlying());
            Intersection intersection = getInstance().getIntersectionMap().get("K3");
            intersection.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", 2));
            getInstance().getIntersectionMap().put("K3", intersection);
            System.out.println("Kreuzungen:" +getInstance().getIntersectionMap().get("K3"));
        });

    }





}
