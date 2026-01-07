package dev.abhishek.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";

    // field injection
    // @Autowired
    private final Vehicle vehicle;

    //constructor injection.
    // this does not need any annotation
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Setter injection
//    @Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }

    public String getVehicle() {
        return vehicle.getName();
    }
}
