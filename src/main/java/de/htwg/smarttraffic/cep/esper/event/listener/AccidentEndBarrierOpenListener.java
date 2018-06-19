package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.cep.esper.event.direction.Directions;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccidentEndBarrierOpenListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        log.info("AccidentEndEvent: " + event.getUnderlying());
        if(event.get("crossing").equals("k2")){
//            Intersection intersectionk3 = Casestudy.getInstance().getIntersectionMap().get("k3");
//            intersectionk3.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "left", false));
//
//            Casestudy.getInstance().getIntersectionMap().put("k3", intersectionk3);
//
//            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
//            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "right", false));
//
//            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "right", false));
//
//            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);

            Directions.setDirectionsK3NoIncident();
            Directions.setDirectionsK1NoIncident();

            Casestudy.getInstance().getIncidents().setAccidentK2(false);
        }
    }
}
