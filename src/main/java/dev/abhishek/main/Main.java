package dev.abhishek.main;

import dev.abhishek.beans.Person;
import dev.abhishek.beans.Vehicle;
import dev.abhishek.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("The person: " + person.getName() + " uses " + person.getVehicle() + " vehicle");
    }
}