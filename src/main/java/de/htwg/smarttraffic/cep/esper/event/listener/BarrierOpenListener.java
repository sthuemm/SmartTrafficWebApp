package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BarrierOpenListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        log.info("RailroadCrossingBarrierOpenEvent: " + eventBeans[0].getUnderlying());
        Intersection intersectionk3 = Casestudy.getInstance().getIntersectionMap().get("k3");
        intersectionk3.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "left"));
        intersectionk3.getTrafficLights().put("otoWRtw", new TrafficLight("otoWRtw", "W <--> O", "left"));
        Casestudy.getInstance().getIntersectionMap().put("k3", intersectionk3);

        Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
        intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "up"));
        intersectionk1.getTrafficLights().put("stoORtw", new TrafficLight("stoORtw", "W <--> O", "up"));
        Casestudy.getInstance().getIntersectionMap().put("k3", intersectionk1);

    }
}
