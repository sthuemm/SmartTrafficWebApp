package de.htwg.smarttraffic.model;

import de.htwg.smarttraffic.cep.esper.EsperRuntime;

import de.htwg.smarttraffic.cep.esper.event.statement.EspStatements;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class Casestudy {

    private static Casestudy instance;

    private Map<String, Intersection> intersectionMap;

    private EventStream eventStream;

    private Incidents incidents;



    @Resource
    EsperRuntime esperRuntime;

    private Casestudy(){
        this.intersectionMap = new HashMap<>();
        Intersection k1 = new Intersection(Intersection.IntersectionType.WNOS);
        Intersection k2 = new Intersection(Intersection.IntersectionType.WNOS);
        Intersection k3 = new Intersection(Intersection.IntersectionType.WNO);

        intersectionMap.put("k1", k1);
        intersectionMap.put("k2", k2);
        intersectionMap.put("k3", k3);

        this.eventStream = new EventStream(esperRuntime);
        this.incidents = new Incidents();
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
        EspStatements.setBarrierCloseStatement();
        EspStatements.setBarrierOpenAccidentOccursStatement();
        EspStatements.setBarrierOpenNoAccidentStatement();
        EspStatements.setAccidentStartStatement();
        EspStatements.setAccidentEndBarrierOpenStatement();
        EspStatements.setAccidentEndBarrierClosedStatement();
        EspStatements.setNitroOxigenHighStatement();
        EspStatements.setNitroOxigenStillHighAfterXMinutes("k2");
        EspStatements.setTrafficHighStatement();
        EspStatements.setTraffiStillHighAfterXMinutesStatement("OtoW");
        EspStatements.setTrafficNormalStatement("OtoW");
//        EspStatements.setNitroOxigenLowStatement();

    }









}
