package com.devone.config;

import com.devone.KafkaTopics;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic devoneTopic() {
        return TopicBuilder.name(KafkaTopics.EXAMPLE)
                .build();
    }
}
