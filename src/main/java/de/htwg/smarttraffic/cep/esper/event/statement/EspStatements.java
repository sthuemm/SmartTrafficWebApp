package de.htwg.smarttraffic.cep.esper.event.statement;

import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import de.htwg.smarttraffic.cep.esper.EsperServiceProvider;
import de.htwg.smarttraffic.cep.esper.event.listener.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EspStatements {

    public static void setTrafficHighStatement(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select count(*) from TrafficStartEvent(direction = 'OtoW')#time(15 seconds) having (count(*) >5 and count(*) <= 6)");
        statement.addListener(new TrafficStartListener("OtoW"));
    }

    public static void setTraffiStillHighAfterXMinutesStatement(String direction){

        EPStatement statementTrafficLow = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select count(*) from TrafficStartEvent(direction = 'OtoW')#time(15 seconds) having count(*) <= 3");
        TrafficEndListener trafficEndListener = new TrafficEndListener(direction);
        statementTrafficLow.addListener(trafficEndListener);


        EPStatement statementTrafficStillHigh = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select count(*) from TrafficStartEvent(direction = 'OtoW')#time(15 seconds) having count(*) >=10");
        statementTrafficStillHigh.addListener(new TrafficTimeIntervalListener(direction));
    }


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

        EPStatement statementlow = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select a,b from pattern [every a = NitrogenOxideStartEvent(crossing = 'k2') -> (timer:interval(10 seconds) and b = NitrogenOxideEndEvent(crossing = a.crossing))]");

        NitroOxigenLowListener nitroOxigenTimeIntervalListener = new NitroOxigenLowListener(crossing);
        statementlow.addListener(nitroOxigenTimeIntervalListener);
        EPStatement statementstillhigh = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select a,b from pattern [every a = NitrogenOxideStartEvent(crossing = 'k2') -> (timer:interval(10 seconds) and not b = NitrogenOxideEndEvent(crossing = a.crossing))]");
        statementstillhigh.addListener(new NitroOxigenTimeIntervalListener(crossing));
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

    public static void set(){
        EPStatement statement = EsperServiceProvider.getInstance().getEPAdministrator()
                .createEPL("select crossing from NitrogenOxideStartEvent");
        statement.addListener(new NitroOxigenHighListener());
    }


}
