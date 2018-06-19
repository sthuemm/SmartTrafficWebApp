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
            intersection.getTrafficLights().put("otoN", new TrafficLight("otoN", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoS", new TrafficLight("otoS", "W <--> O", "up", true));

            intersection.getTrafficLights().put("ntoW", new TrafficLight("ntoW", "W <--> O", "right", true));
            intersection.getTrafficLights().put("ntoS", new TrafficLight("ntoS", "W <--> O", "right", true));
            intersection.getTrafficLights().put("ntoN", new TrafficLight("ntoN", "W <--> O", "right", true));


            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("stoN", new TrafficLight("stoN", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("stoS", new TrafficLight("stoS", "W <--> O", "left", true));

            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("wtoS", new TrafficLight("wtoS", "W <--> O", "down", true));
            intersectionk1.getTrafficLights().put("wtoN", new TrafficLight("wtoN", "W <--> O", "up", true));


            intersectionk1.getTrafficLights().put("ntoO", new TrafficLight("ntoO", "W <--> O", "left", true));
            intersectionk1.getTrafficLights().put("ntoS", new TrafficLight("ntoS", "W <--> O", "down", true));
            intersectionk1.getTrafficLights().put("ntoN", new TrafficLight("ntoN", "W <--> O", "left", true));
            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);
            Casestudy.getInstance().getIncidents().setAccidentK2(true);
        }

    }
}
