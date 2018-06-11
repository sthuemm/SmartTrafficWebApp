package de.htwg.smarttraffic.cep.esper.event.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class NitroOxigenTimeIntervalListener implements UpdateListener {

    private String crossing;




    @Override
    public void update(EventBean[] eventBeans, EventBean[] eventBeans1) {
        EventBean eventBean = eventBeans[0];

        if(eventBean.get("rate(10)") == null){
            log.info(eventBean.getUnderlying().toString());
            log.error("Stickstoffausstoß an '"+crossing+"' nach 10 Sekunden immernoch zu hoch");
        } else {
            log.info("Feinstaubalarm aufgehoben");
        }
    }
}
