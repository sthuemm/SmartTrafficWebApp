package de.htwg.smarttraffic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrafficLight {

    private String id;
    private String description;
    private String arrow;
    private boolean incident;


}
