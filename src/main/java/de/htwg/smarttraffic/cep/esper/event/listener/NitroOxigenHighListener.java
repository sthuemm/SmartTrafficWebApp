package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.cep.esper.event.statement.EspStatements;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NitroOxigenHighListener implements UpdateListener {

    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean event = eventBeans[0];
        EspStatements.setNitroOxigenStillHighAfterXMinutes(event.get("crossing").toString());
        log.info("NitrogenOxideStartEvent: " + event.getUnderlying());
        if(event.get("crossing").equals("K2")){
            log.info("Stickstoffgrenzwerte an K2 sind überschritten");
        }
    }
}
