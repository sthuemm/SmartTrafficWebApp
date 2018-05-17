package de.htwg.smarttraffic.cep.esper;


import com.espertech.esper.client.EPRuntime;
import de.htwg.smarttraffic.cep.ComplexEventProcessingEngine;


public class EsperRuntime implements ComplexEventProcessingEngine {

    private static EPRuntime instance;

    private EsperRuntime(){}

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
