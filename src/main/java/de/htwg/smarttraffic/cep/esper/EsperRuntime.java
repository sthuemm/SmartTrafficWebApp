package de.htwg.smarttraffic.cep.esper;


import com.espertech.esper.client.EPRuntime;
import de.htwg.smarttraffic.cep.ComplexEventProcessingEngine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class EsperRuntime implements ComplexEventProcessingEngine {

    private static EPRuntime instance;

    public EsperRuntime(){
        log.info("EsperRuntime started");
    }

    public static EPRuntime getInstance(){
        if(instance == null){
            instance = getRuntime();
        }
        return instance;
    }


    private static EPRuntime getRuntime(){
        return EsperServiceProvider.getInstance().getEPRuntime();
    }




}
