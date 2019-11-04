package com.example.demokafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class Consumer {

    private final Logger log = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "testTopic", groupId = "group-id")
    public void consume(String message) {
        log.info("MESSAGE CONSUMER ===== {}", message);
    }
}
