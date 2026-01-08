package dev.abhishek.config;

import dev.abhishek.beans.Person;
import dev.abhishek.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "dev.abhishek.beans")
public class ProjectConfig {

    @Primary
    @Bean
    public Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }


    @Bean
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }


    @Bean
    public Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }
//
//    @Bean
//    public Person person1() {
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle1());
//        return person;
//    }
//
//
//    @Bean
//    public Person person2() {
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle1());
//        return person;
//    }

}
