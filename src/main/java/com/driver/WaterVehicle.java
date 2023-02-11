package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}

class Boat implements WaterVehicle{
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
