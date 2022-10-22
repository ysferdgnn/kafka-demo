package com.ysferdgnn.api;

import com.ysferdgnn.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/counter")
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @GetMapping
    public String getCounter(){
        producerService.sendMessage("test message");
        return "There is a Counter";

    }
}
