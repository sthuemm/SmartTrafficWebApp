package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.cep.esper.event.direction.Directions;
import de.htwg.smarttraffic.model.Casestudy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class TrafficEndBarrierClosedListener implements UpdateListener{

    private String direction;

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        if(direction.equals("OtoW") && Casestudy.getInstance().getIncidents().isTrafficK2()){

            log.info("TrafficEndEvent: " + event.getUnderlying());


            //Set Incident Boolean for Trigger
            Casestudy.getInstance().getIncidents().setTrafficK2(false);
            Casestudy.getInstance().getIncidents().setSetTrafficLongHigh(false);

            Directions.setDirectionsK1BarrierS1Closed();
            Directions.setDirectionsK3BarrierS1Closed();
        }

    }


}
