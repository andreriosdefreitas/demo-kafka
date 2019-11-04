package com.example.demokafka.rest;

import com.example.demokafka.kafka.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

    private Producer producer;

    public ProducerController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/producer")
    public void sendMessage(@RequestBody String message) {
        producer.sendEvent(message);
    }
}
