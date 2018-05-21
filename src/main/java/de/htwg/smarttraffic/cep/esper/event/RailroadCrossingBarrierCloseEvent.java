package de.htwg.smarttraffic.cep.esper.event;

public class RailroadCrossingBarrierCloseEvent {

    private String railwayCrossing;

    public RailroadCrossingBarrierCloseEvent(String railwayCrossing){
        this.railwayCrossing = railwayCrossing;
    }

    public String getRailwayCrossing() {
        return railwayCrossing;
    }

    public void setRailwayCrossing(String railwayCrossing) {
        this.railwayCrossing = railwayCrossing;
    }
}
