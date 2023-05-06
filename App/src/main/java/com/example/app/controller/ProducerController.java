package com.example.app.controller;

import com.example.app.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController
{
    //member variable
    @Autowired private ProducerService producerService;

    //member method
    @GetMapping(value="/send")
    public void send(@RequestParam(value="string") String string){producerService.send(string);}
}