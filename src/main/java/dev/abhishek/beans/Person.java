package dev.abhishek.beans;

public class Person {
    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle.getName();
    }
}
