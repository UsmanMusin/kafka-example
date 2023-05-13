package com.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "seniorPomidor", groupId = "groupId")
    void listener(String data) {
        System.out.println("Получено сообщение:" + data);
    }
}
