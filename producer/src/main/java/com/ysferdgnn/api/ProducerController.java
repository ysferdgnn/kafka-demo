package com.ysferdgnn.api;

import com.ysferdgnn.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/message")
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @PostMapping
    public void getCounter(@RequestBody String message){
        producerService.sendMessage(message);
    }
}
