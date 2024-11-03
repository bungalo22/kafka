package com.kafka_demo.kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "course", groupId = "my_consumer")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}
