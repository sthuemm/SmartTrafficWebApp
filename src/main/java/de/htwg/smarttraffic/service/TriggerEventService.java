package de.htwg.smarttraffic.service;

import de.htwg.smarttraffic.cep.esper.EsperRuntime;
import de.htwg.smarttraffic.cep.esper.event.RailroadCrossingBarrierCloseEvent;
import de.htwg.smarttraffic.cep.esper.event.RailroadCrossingBarrierOpenEvent;
import org.springframework.stereotype.Service;


@Service
public class TriggerEventService {

    public void triggerRailwayCrossingDownEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new RailroadCrossingBarrierCloseEvent(railwayCrossing));
    }

    public void triggerRailwayCrossingOpenEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new RailroadCrossingBarrierOpenEvent(railwayCrossing));
    }

}
