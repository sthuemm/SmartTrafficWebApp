package de.htwg.smarttraffic.cep.esper.event.traffic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TrafficEndEvent {

    private String direction;
}
