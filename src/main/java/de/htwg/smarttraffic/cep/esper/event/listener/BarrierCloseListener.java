package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BarrierCloseListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        log.info("RailroadCrossingBarrierCloseEvent: " + eventBeans[0].getUnderlying());

        Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
        intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up"));
        intersection.getTrafficLights().put("otoWRtw", new TrafficLight("otoWRtw", "W <--> O", "up"));
        Casestudy.getInstance().getIntersectionMap().put("k3", intersection);
        log.info("Kreuzungen:" +Casestudy.getInstance().getIntersectionMap().get("k3"));
    }

}
