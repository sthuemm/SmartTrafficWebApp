package de.htwg.smarttraffic.cep.esper.event;

import de.htwg.smarttraffic.model.TrafficLight;

import java.util.Date;

public class TrafficEvent {

    private Type type;

    private String direction;

    public enum Type {
        CAR_ARRIVES,
        RAILWAY_BARRIER_CLOSES,
        RAILWAY_BARRIER_OPENS

    }

    public TrafficEvent(Type type /*,Date timeStamp*/) {
        //super(timeStamp);
        this.type = type;
    }

    public TrafficEvent(String direction){
        this.direction = direction;
    }


}
