package com.example.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService
{
    //member variable
    Logger logger= LoggerFactory.getLogger("ConsumerService");

    //member method
    @KafkaListener(topics={"ZooToApp"})
    public void receive(String anotherString){this.logger.info(anotherString+"a");}
}