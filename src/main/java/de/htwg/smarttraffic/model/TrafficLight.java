package de.htwg.smarttraffic.model;

public class TrafficLight {

    private String id;
    private String description;
    private int value;

    public TrafficLight(String id, String description, int value){
        this.id = id;
        this.description = description;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
