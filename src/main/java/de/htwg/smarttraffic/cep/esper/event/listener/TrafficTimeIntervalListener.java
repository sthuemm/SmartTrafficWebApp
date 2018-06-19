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
        log.info("Traffic still high: " + eventBean.getUnderlying());

        if(direction.equals("OtoW")) {
            //Set K3 Traffic Lights
            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");

            //From N
            intersection.getTrafficLights().put("ntoW", new TrafficLight("ntoW", "W <--> O", "right", true));
//            intersection.getTrafficLights().put("ntoO", new TrafficLight("otoO", "W <--> O", "right", true));
            intersection.getTrafficLights().put("ntoN", new TrafficLight("ntoN", "W <--> O", "right", true));
            intersection.getTrafficLights().put("ntoS", new TrafficLight("ntoS", "W <--> O", "right", true));
            //From O
            intersection.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoS", new TrafficLight("otoS", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoN", new TrafficLight("otoN", "W <--> O", "up", true));
            //From W
//            intersection.getTrafficLights().put("wtoW", new TrafficLight("otoW", "W <--> O", "up", true));
//            intersection.getTrafficLights().put("wtoO", new TrafficLight("otoS", "W <--> O", "right", false));
//            intersection.getTrafficLights().put("wtoN", new TrafficLight("otoN", "W <--> O", "up", false));

            intersection.getTrafficLights().put("ntoWRtw", new TrafficLight("ntoWRtw", "W <--> O", "right", true));
            intersection.getTrafficLights().put("ntoNRtw", new TrafficLight("ntoNRtw", "W <--> O", "right", true));
            intersection.getTrafficLights().put("ntoSRtw", new TrafficLight("ntoSRtw", "W <--> O", "right", true));
            intersection.getTrafficLights().put("otoWRtw", new TrafficLight("otoWRtw", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoSRtw", new TrafficLight("otoSRtw", "W <--> O", "up", true));
            intersection.getTrafficLights().put("otoNRtw", new TrafficLight("otoNRtw", "W <--> O", "up", true));



            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            //Set K1 Traffic Lights
            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            //From N
//            intersectionk1.getTrafficLights().put("ntoN", new TrafficLight("ntoN", "W <--> O", "left", true));
//            intersectionk1.getTrafficLights().put("ntoO", new TrafficLight("ntoO", "W <--> O", "right", true));
//            intersectionk1.getTrafficLights().put("ntoS", new TrafficLight("ntoS", "W <--> O", "down", false));
            intersectionk1.getTrafficLights().put("ntoW", new TrafficLight("ntoW", "W <--> O", "right", true));
            intersectionk1.getTrafficLights().put("ntoWRtw", new TrafficLight("ntoWRtw", "W <--> O", "right", true));
            //From O
//            intersectionk1.getTrafficLights().put("otoN", new TrafficLight("otoN", "W <--> O", "up", false));
//            intersectionk1.getTrafficLights().put("otoO", new TrafficLight("otoO", "W <--> O", "down", false));
//            intersectionk1.getTrafficLights().put("otoS", new TrafficLight("otoS", "W <--> O", "down", false));
//            intersectionk1.getTrafficLights().put("otoW", new TrafficLight("otoW", "W <--> O", "up", true));
            //From S
//            intersectionk1.getTrafficLights().put("stoN", new TrafficLight("stoN", "W <--> O", "up", false));
//            intersectionk1.getTrafficLights().put("stoO", new TrafficLight("stoO", "W <--> O", "right", true));
//            intersectionk1.getTrafficLights().put("stoS", new TrafficLight("stoS", "W <--> O", "right", true));
            intersectionk1.getTrafficLights().put("stoW", new TrafficLight("stoW", "W <--> O", "up", true));
            intersectionk1.getTrafficLights().put("stoWRtw", new TrafficLight("stoWRtw", "W <--> O", "up", true));
            //From W
//            intersectionk1.getTrafficLights().put("wtoN", new TrafficLight("wtoN", "W <--> O", "up", false));
//            intersectionk1.getTrafficLights().put("wtoO", new TrafficLight("wtoO", "W <--> O", "right", true));
//            intersectionk1.getTrafficLights().put("wtoS", new TrafficLight("wtoO", "W <--> O", "down", true));
//            intersectionk1.getTrafficLights().put("wtoW", new TrafficLight("wtoW", "W <--> O", "up", true));
            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);

            //Set Incident Boolean for Trigger
            Casestudy.getInstance().getIncidents().setSetTrafficLongHigh(true);
        }
    }


    }
