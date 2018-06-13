package de.htwg.smarttraffic.cep.esper.event.railroad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RailroadCrossingBarrierCloseEvent {

    private String railwayCrossing;

}
