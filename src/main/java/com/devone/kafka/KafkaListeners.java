package com.devone.kafka;

import com.devone.KafkaTopics;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = KafkaTopics.EXAMPLE, groupId = "any-group-name")
    void listener(String data) {
        System.out.println("Listener received data: " + data + " 🤩🎉");
    }
}
