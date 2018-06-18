package de.htwg.smarttraffic.cep.esper;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import de.htwg.smarttraffic.cep.esper.event.accident.AccidentEndEvent;
import de.htwg.smarttraffic.cep.esper.event.accident.AccidentStartEvent;
import de.htwg.smarttraffic.cep.esper.event.environment.NitrogenOxideEndEvent;
import de.htwg.smarttraffic.cep.esper.event.environment.NitrogenOxideStartEvent;
import de.htwg.smarttraffic.cep.esper.event.railroad.RailroadCrossingBarrierCloseEvent;
import de.htwg.smarttraffic.cep.esper.event.railroad.RailroadCrossingBarrierOpenEvent;
import de.htwg.smarttraffic.cep.esper.event.traffic.TrafficStartEvent;
import de.htwg.smarttraffic.cep.esper.event.traffic.TrafficEndEvent;


import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@org.springframework.context.annotation.Configuration
@Slf4j
public class EsperServiceProvider {

    private static EPServiceProvider serviceProvider;

    public EsperServiceProvider(){
        log.info("EsperServiceProvider started");
    }

    public static EPServiceProvider getInstance(){
        if(serviceProvider == null){
            serviceProvider = EPServiceProviderManager.getDefaultProvider(getConfiguration());
        }

        return serviceProvider;
    }

    private static Configuration getConfiguration(){
        Configuration configuration = new Configuration();
        configuration.addEventType("TrafficEvent", getEventProperties());
        configuration.addEventType("RailroadCrossingBarrierCloseEvent", RailroadCrossingBarrierCloseEvent.class.getName());
        configuration.addEventType("RailroadCrossingBarrierOpenEvent", RailroadCrossingBarrierOpenEvent.class.getName());
        configuration.addEventType("AccidentEndEvent", AccidentEndEvent.class.getTypeName());
        configuration.addEventType("AccidentStartEvent", AccidentStartEvent.class.getTypeName());
        configuration.addEventType("NitrogenOxideStartEvent", NitrogenOxideStartEvent.class.getTypeName());
        configuration.addEventType("NitrogenOxideEndEvent", NitrogenOxideEndEvent.class.getTypeName());
        configuration.addEventType("TrafficStartEvent", TrafficStartEvent.class.getTypeName());
        configuration.addEventType("TrafficEndEvent", TrafficEndEvent.class.getTypeName());
        return configuration;
    }

    private static Map<String, Object> getEventProperties(){
        Map<String, Object> eventProperties = new HashMap<String, Object>();
        eventProperties.put("type", String.class);

        return eventProperties;
    }

}
