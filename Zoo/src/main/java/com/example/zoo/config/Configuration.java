package com.example.zoo.config;

import com.example.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration
{
    @Bean @Qualifier(value="b") public AnimalService animalService1(){return new AnimalService();}
    @Bean @Qualifier(value="c") public AnimalService animalService2(){return new AnimalService();}
}