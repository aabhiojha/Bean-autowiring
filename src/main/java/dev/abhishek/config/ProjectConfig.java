package dev.abhishek.config;

import dev.abhishek.beans.Person;
import dev.abhishek.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dev.abhishek.beans")
public class ProjectConfig {


}
