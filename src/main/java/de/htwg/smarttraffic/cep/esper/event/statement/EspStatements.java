package de.htwg.smarttraffic.cep.esper.event.statement;

import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import de.htwg.smarttraffic.cep.esper.EsperServiceProvider;
import de.htwg.smarttraffic.cep.esper.event.listener.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EspStatements {

    public static void setAccidentStartStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select crossing from AccidentStartEvent");
        statement.addListener(new AccidentStartListener());
    }

    public static void setAccidentEndStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select crossing from AccidentEndEvent");
        statement.addListener(new AccidentEndListener());
    }

    public static void setNitroOxigenHighStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select crossing from NitrogenOxideStartEvent");
        statement.addListener(new NitroOxigenHighListener());
    }

    public static void setNitroOxigenStillHighAfterXMinutes(String crossing){
        log.info("beobachte stickoxid für 10 sekunden");
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select rate(10) from NitrogenOxideEndEvent where crossing = '"+crossing+"' output snapshot every 10 sec ");
        NitroOxigenTimeIntervalListener nitroOxigenTimeIntervalListener = new NitroOxigenTimeIntervalListener(crossing);
        statement.addListener(nitroOxigenTimeIntervalListener);

    }

    public static void setNitroOxigenLowStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select crossing from NitrogenOxideEndEvent");
        statement.addListener(new NitroOxigenLowListener());
    }



    public static void setBarrierCloseStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select railwayCrossing from RailroadCrossingBarrierCloseEvent");
        statement.addListener(new BarrierCloseListener());

    }

    public static void setBarrierOpenStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select railwayCrossing from RailroadCrossingBarrierOpenEvent");
        statement.addListener(new BarrierOpenListener());
    }


}
