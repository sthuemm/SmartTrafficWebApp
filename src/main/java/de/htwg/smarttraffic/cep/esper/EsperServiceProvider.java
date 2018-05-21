package de.htwg.smarttraffic.cep.esper;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import de.htwg.smarttraffic.cep.esper.event.RailroadCrossingBarrierCloseEvent;
import de.htwg.smarttraffic.cep.esper.event.RailroadCrossingBarrierOpenEvent;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@org.springframework.context.annotation.Configuration
public class EsperServiceProvider {

    private static EPServiceProvider serviceProvider;

    public EsperServiceProvider(){
        System.out.println("EsperServiceProvider started");
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
        configuration.addEventType("RailroadCrossingBarrierOpenEvent", RailroadCrossingBarrierOpenEvent.class.getTypeName());
        return configuration;
    }

    private static Map<String, Object> getEventProperties(){
        Map<String, Object> eventProperties = new HashMap<String, Object>();
        eventProperties.put("type", String.class);

        return eventProperties;
    }

}
