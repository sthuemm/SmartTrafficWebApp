package de.htwg.smarttraffic.cep.esper;


import com.espertech.esper.client.EPRuntime;
import de.htwg.smarttraffic.cep.ComplexEventProcessingEngine;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EsperRuntime implements ComplexEventProcessingEngine {

    private static EPRuntime instance;

    public EsperRuntime(){
        System.out.println("EsperRuntime started");
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
