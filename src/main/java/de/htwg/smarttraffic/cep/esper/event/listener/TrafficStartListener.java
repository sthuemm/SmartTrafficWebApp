package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.model.Casestudy;
import de.htwg.smarttraffic.model.Intersection;
import de.htwg.smarttraffic.model.TrafficLight;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TrafficStartListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        log.info("TrafficStartEvent: " + event.getUnderlying());
        if(event.get("direction").equals("OtoW")){
            /*No need to set Traffic Lights
            //Set K3 Traffic Lights
            Intersection intersection = Casestudy.getInstance().getIntersectionMap().get("k3");
            Casestudy.getInstance().getIntersectionMap().put("k3", intersection);

            //Set K1 Traffic Lights
            Intersection intersectionk1 = Casestudy.getInstance().getIntersectionMap().get("k1");
            Casestudy.getInstance().getIntersectionMap().put("k1", intersectionk1);
            */
            //Set Incident Boolean for Trigger
            Casestudy.getInstance().getIncidents().setTrafficK2(true);
        }

    }
}
