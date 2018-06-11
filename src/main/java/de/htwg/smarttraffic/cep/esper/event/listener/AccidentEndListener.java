package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccidentEndListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        log.info("AccidentEndEvent: " + event.getUnderlying());
        if(event.get("crossing").equals("K2")){
            log.info("Accident an K2 vorbei");
        }
    }
}
