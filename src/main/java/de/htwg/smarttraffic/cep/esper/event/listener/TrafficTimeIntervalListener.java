package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EPStatement;
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
public class TrafficTimeIntervalListener implements UpdateListener {

    private String direction;

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean eventBean = eventBeans[0];
        System.out.println(eventBean.getUnderlying());
        log.info("Traffic still high");

        //Set K3 Traffic Lights
        Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
        intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up", true));
        intersection.getTrafficLights().put("otoS", new TrafficLight("otoS", "W <--> O", "up", false));
        intersection.getTrafficLights().put("otoN", new TrafficLight("otoN", "W <--> O", "up", false));

        intersection.getTrafficLights().put("ntoW", new TrafficLight("otoW", "W <--> O", "right", false));
        intersection.getTrafficLights().put("ntoO", new TrafficLight("otoS", "W <--> O", "right", true));
        intersection.getTrafficLights().put("ntoN", new TrafficLight("otoN", "W <--> O", "right", false));

        intersection.getTrafficLights().put("wtoW", new TrafficLight("otoW", "W <--> O", "up", false));
        intersection.getTrafficLights().put("wtoO", new TrafficLight("otoS", "W <--> O", "right", false));
        intersection.getTrafficLights().put("wtoN", new TrafficLight("otoN", "W <--> O", "right", false));
        Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

        //Set K1 Traffic Lights
        Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
        intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "right", true));
        intersectionk1.getTrafficLights().put("ntoO", new TrafficLight("stoO", "W <--> O", "right", true));
        intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "right", true));

        intersectionk1.getTrafficLights().put("stoS", new TrafficLight("stoO", "W <--> O", "left", true));
        intersectionk1.getTrafficLights().put("ntoS", new TrafficLight("stoO", "W <--> O", "down", true));
        intersectionk1.getTrafficLights().put("wtoS", new TrafficLight("wtoO", "W <--> O", "down", true));

        intersectionk1.getTrafficLights().put("stoN", new TrafficLight("stoO", "W <--> O", "left", true));
        intersectionk1.getTrafficLights().put("ntoN", new TrafficLight("stoO", "W <--> O", "left", true));
        intersectionk1.getTrafficLights().put("wtoN", new TrafficLight("wtoO", "W <--> O", "down", true));
        Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);

        //Set Incident Boolean for Trigger
        Casestudy.getInstance().getIncidents().setSetTrafficLongHigh(true);
    }


    }