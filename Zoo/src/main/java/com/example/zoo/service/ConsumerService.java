package com.example.zoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService
{
    //member variable
    @Autowired private ProducerService producerService;

    //member method
    @KafkaListener(topics={"AppToZoo"})
    public void receive(String string)
    {
        producerService.send(string);
    }
}