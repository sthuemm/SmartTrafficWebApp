package de.htwg.smarttraffic.cep.esper.event;

public class RailroadCrossingBarrierOpenEvent {

    private String railwayCrossing;

    public RailroadCrossingBarrierOpenEvent(String railwayCrossing){
        this.railwayCrossing = railwayCrossing;
    }

    public String getRailwayCrossing() {
        return railwayCrossing;
    }

    public void setRailwayCrossing(String railwayCrossing) {
        this.railwayCrossing = railwayCrossing;
    }
}
