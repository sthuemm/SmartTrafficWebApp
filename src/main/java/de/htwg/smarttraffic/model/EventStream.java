package de.htwg.smarttraffic.model;

public class EventStream {

    private int trafficOtoW;

    private int trafficNtoS;

    private int trafficNtoO;

    private int trafficNtoW;

    private int trafficStoO;

    private int trafficStoW;

    public EventStream(){
        this.trafficNtoW = 10;
        this.trafficNtoS = 10;
        this.trafficNtoO = 10;
        this.trafficOtoW = 10;
        this.trafficStoW = 10;
        this.trafficStoO = 10;
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
