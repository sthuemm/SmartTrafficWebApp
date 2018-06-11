package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class NitroOxigenTimeIntervalListener implements UpdateListener {

    private String crossing;

    public NitroOxigenTimeIntervalListener(String crossing) {
        this.crossing = crossing;

    }

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean eventBean = eventBeans[0];
        log.info("update");
        System.out.println(eventBean.getUnderlying());
//        if(eventBean.get("rate(10)") == null && crossing.equals("k2")){
            log.info("Stickstoff still high");
            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
            intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoS", new TrafficLight("otoS", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoN", new TrafficLight("otoN", "W <--> O", "up", true));
            intersection.getTrafficLights().put("ntoW", new TrafficLight("ntoW", "W <--> O", "right", true));
            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("ntoO", new TrafficLight("stoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "up", true));

            intersectionk1.getTrafficLights().put("stoS", new TrafficLight("stoO", "W <--> O", "left", true));
            intersectionk1.getTrafficLights().put("ntoS", new TrafficLight("stoO", "W <--> O", "down", true));
            intersectionk1.getTrafficLights().put("wtoS", new TrafficLight("wtoO", "W <--> O", "down", true));

            intersectionk1.getTrafficLights().put("stoN", new TrafficLight("stoO", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("ntoN", new TrafficLight("stoO", "W <--> O", "left", true));
            intersectionk1.getTrafficLights().put("wtoN", new TrafficLight("wtoO", "W <--> O", "up", true));

            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);
//        } else if(crossing.equals("k2") && eventBean.get("rate(10)") != null) {
//            originStatement.removeAllListeners();
//            originStatement.destroy();
//            log.info("removed listener");
//            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
//            intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "left", false));
//            intersection.getTrafficLights().put("ntoW", new TrafficLight("ntoW", "W <--> O", "left", false));
//            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);
//
//            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
//            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "right", false));
//            intersectionk1.getTrafficLights().put("ntoO", new TrafficLight("stoO", "W <--> O", "right", false));
//            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "right", false));
//
//            intersectionk1.getTrafficLights().put("stoS", new TrafficLight("stoO", "W <--> O", "right", false));
//            intersectionk1.getTrafficLights().put("ntoS", new TrafficLight("stoO", "W <--> O", "right", false));
//            intersectionk1.getTrafficLights().put("wtoS", new TrafficLight("wtoO", "W <--> O", "right", false));
//
//            intersectionk1.getTrafficLights().put("stoN", new TrafficLight("stoO", "W <--> O", "right", false));
//            intersectionk1.getTrafficLights().put("ntoN", new TrafficLight("stoO", "W <--> O", "right", false));
//            intersectionk1.getTrafficLights().put("wtoN", new TrafficLight("wtoO", "W <--> O", "right", false));
//        }
    }
}
