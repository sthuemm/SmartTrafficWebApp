package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class NitroOxigenLowListener implements UpdateListener {

    private String crossing;


    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        log.info("NitrogenOxideEndEvent: " + event.getUnderlying());
        if(crossing.equals("k2")){
            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
            intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "left", false));
            intersection.getTrafficLights().put("otoN", new TrafficLight("otoW", "W <--> O", "left", false));
            intersection.getTrafficLights().put("otoS", new TrafficLight("otoW", "W <--> O", "left", false));
            intersection.getTrafficLights().put("ntoW", new TrafficLight("ntoW", "W <--> O", "left", false));
            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "right", false));
            intersectionk1.getTrafficLights().put("ntoO", new TrafficLight("stoO", "W <--> O", "right", false));
            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "right", false));

            intersectionk1.getTrafficLights().put("stoS", new TrafficLight("stoO", "W <--> O", "right", false));
            intersectionk1.getTrafficLights().put("ntoS", new TrafficLight("stoO", "W <--> O", "right", false));
            intersectionk1.getTrafficLights().put("wtoS", new TrafficLight("wtoO", "W <--> O", "right", false));

            intersectionk1.getTrafficLights().put("stoN", new TrafficLight("stoO", "W <--> O", "right", false));
            intersectionk1.getTrafficLights().put("ntoN", new TrafficLight("stoO", "W <--> O", "right", false));
            intersectionk1.getTrafficLights().put("wtoN", new TrafficLight("wtoO", "W <--> O", "right", false));
        }
    }
}
