package de.htwg.smarttraffic.model;

import de.htwg.smarttraffic.cep.esper.EsperRuntime;
import de.htwg.smarttraffic.cep.esper.event.traffic.TrafficEvent;
import de.htwg.smarttraffic.cep.esper.event.traffic.TrafficStartEvent;

public class EventStream {

    private int trafficOtoW;

    private int trafficNtoS;

    private int trafficNtoO;

    private int trafficNtoW;

    private int trafficStoO;

    private int trafficStoW;

    public EventStream(EsperRuntime esperRuntime){
        this.trafficNtoW = 10;
        this.trafficNtoS = 10;
        this.trafficNtoO = 10;
        this.trafficOtoW = 10;
        this.trafficStoW = 10;
        this.trafficStoO = 10;

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(60000/trafficOtoW);
                    synchronized (EsperRuntime.getInstance()){
                        EsperRuntime.getInstance().sendEvent(new TrafficStartEvent("OtoW"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(60000/trafficNtoS);
                    synchronized (EsperRuntime.getInstance()){
                        EsperRuntime.getInstance().sendEvent(new TrafficEvent("N <--> S"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(60000/trafficNtoO);
                    synchronized (EsperRuntime.getInstance()){
                        EsperRuntime.getInstance().sendEvent(new TrafficEvent("N <--> O"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(60000/trafficNtoW);
                    synchronized (EsperRuntime.getInstance()){
                        EsperRuntime.getInstance().sendEvent(new TrafficEvent("N <--> W"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(60000/trafficStoW);
                    synchronized (EsperRuntime.getInstance()){
                        EsperRuntime.getInstance().sendEvent(new TrafficEvent("S <--> W"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(60000/trafficStoO);
                    synchronized (EsperRuntime.getInstance()){
                        EsperRuntime.getInstance().sendEvent(new TrafficEvent("S <--> O"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

    public int getTrafficOtoW() {
        return trafficOtoW;
    }

    public void setTrafficOtoW(int trafficOtoW) {
        this.trafficOtoW = trafficOtoW;
    }

    public int getTrafficNtoS() {
        return trafficNtoS;
    }

    public void setTrafficNtoS(int trafficNtoS) {
        this.trafficNtoS = trafficNtoS;
    }

    public int getTrafficNtoO() {
        return trafficNtoO;
    }

    public void setTrafficNtoO(int trafficNtoO) {
        this.trafficNtoO = trafficNtoO;
    }

    public int getTrafficNtoW() {
        return trafficNtoW;
    }

    public void setTrafficNtoW(int trafficNtoW) {
        this.trafficNtoW = trafficNtoW;
    }

    public int getTrafficStoO() {
        return trafficStoO;
    }

    public void setTrafficStoO(int trafficStoO) {
        this.trafficStoO = trafficStoO;
    }

    public int getTrafficStoW() {
        return trafficStoW;
    }

    public void setTrafficStoW(int trafficStoW) {
        this.trafficStoW = trafficStoW;
    }
}
