package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.controller.WebsocketController;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;

import javax.annotation.Resource;

@Slf4j
public class BarrierCloseListener implements UpdateListener {


    WebsocketController websocketController = new WebsocketController();

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        log.info("RailroadCrossingBarrierCloseEvent: " + eventBeans[0].getUnderlying());

        if(eventBeans[0].get("railwayCrossing").equals("s1")){
            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
            intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoWRtw", new TrafficLight("otoWRtw", "W <--> O", "up", true));
            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("stoORtw", new TrafficLight("stoORtw", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("wtoORtw", new TrafficLight("wtoORtw", "W <--> O", "up", true));
            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);
            Casestudy.getInstance().getIncidents().setBarrierS1(true);

        }

    }

}
