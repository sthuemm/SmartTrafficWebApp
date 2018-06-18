package de.htwg.smarttraffic.service;

import de.htwg.smarttraffic.cep.esper.EsperRuntime;
import de.htwg.smarttraffic.cep.esper.event.accident.AccidentEndEvent;
import de.htwg.smarttraffic.cep.esper.event.accident.AccidentStartEvent;
import de.htwg.smarttraffic.cep.esper.event.environment.NitrogenOxideEndEvent;
import de.htwg.smarttraffic.cep.esper.event.environment.NitrogenOxideStartEvent;
import de.htwg.smarttraffic.cep.esper.event.railroad.RailroadCrossingBarrierCloseEvent;
import de.htwg.smarttraffic.cep.esper.event.railroad.RailroadCrossingBarrierOpenEvent;
import de.htwg.smarttraffic.cep.esper.event.traffic.TrafficStartEvent;
import de.htwg.smarttraffic.cep.esper.event.traffic.TrafficEndEvent;
import org.springframework.stereotype.Service;


@Service
public class TriggerEventService {

    public void triggerRailwayCrossingDownEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new RailroadCrossingBarrierCloseEvent(railwayCrossing));
    }

    public void triggerRailwayCrossingOpenEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new RailroadCrossingBarrierOpenEvent(railwayCrossing));
    }

    public void triggerAccidentCrossingStartEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new AccidentStartEvent(railwayCrossing));
    }

    public void triggerAccidentCrossingEndEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new AccidentEndEvent(railwayCrossing));
    }

    public void triggerNitroxigenCrossingHighEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new NitrogenOxideStartEvent(railwayCrossing));
    }

    public void triggerNitrooxigenCrossingLowEvent(String railwayCrossing){
        EsperRuntime.getInstance().sendEvent(new NitrogenOxideEndEvent(railwayCrossing));
    }

    public void triggerTrafficDirectionHighEvent(String direction){
        EsperRuntime.getInstance().sendEvent(new TrafficStartEvent(direction));
    }

    public void triggerTrafficDirectionLowEvent(String direction){
        EsperRuntime.getInstance().sendEvent(new TrafficEndEvent(direction));
    }

}
