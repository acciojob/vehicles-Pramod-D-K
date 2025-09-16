package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private  int capacity;

    public Boat(){

    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public void setVehicleName(String name) {
        this.name = name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }

    public void setVehicleCapacity(int capacity) {
        this.capacity = capacity;
    }
}
