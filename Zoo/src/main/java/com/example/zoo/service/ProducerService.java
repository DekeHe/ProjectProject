package com.example.zoo.service;

import com.example.zoo.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService
{
    //member variable
    @Autowired private KafkaTemplate<Animal,String> kafkaTemplate;

    //member method
    public void send(String anotherString){kafkaTemplate.send("ZooToApp",anotherString);}
}