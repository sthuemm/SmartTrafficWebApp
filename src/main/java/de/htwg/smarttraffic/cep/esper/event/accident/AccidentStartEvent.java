package de.htwg.smarttraffic.cep.esper.event.accident;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AccidentStartEvent {

    private String crossing;

}
