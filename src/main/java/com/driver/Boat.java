package com.driver;
public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    Boat(){
        this.name = "";
        this.capacity = 0;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

}
