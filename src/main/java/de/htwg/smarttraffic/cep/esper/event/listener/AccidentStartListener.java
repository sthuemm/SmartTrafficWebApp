package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccidentStartListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        log.info("AccidentStartEvent: " + event.getUnderlying());
        if(event.get("crossing").equals("k2")){
            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
            intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up", true));

            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "up", true));

            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "up", true));

            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);
            Casestudy.getInstance().getIncidents().setAccidentK2(true);
        }

    }
}
