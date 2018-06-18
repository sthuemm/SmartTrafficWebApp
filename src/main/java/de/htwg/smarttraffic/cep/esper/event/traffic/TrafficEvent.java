package de.htwg.smarttraffic.cep.esper.event.traffic;

import de.htwg.smarttraffic.model.TrafficLight;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
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
