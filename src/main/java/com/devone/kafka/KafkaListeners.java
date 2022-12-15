package com.devone.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "devone", groupId = "any-group-name")
    void listener(String data) {
        System.out.println("Listener received data: " + data + " 🤩🎉");
    }
}
