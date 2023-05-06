package com.example.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService
{
    //member variable
    @Autowired private KafkaTemplate<String,String> kafkaTemplate;

    //member method
    public void send(String string)
    {
        kafkaTemplate.send("AppToZoo",string);
    }
}