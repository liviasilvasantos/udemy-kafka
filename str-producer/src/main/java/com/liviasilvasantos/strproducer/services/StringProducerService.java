package com.liviasilvasantos.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String message) {
        log.info("sending message {}", message);
        kafkaTemplate.send("str-topic", message);
//                .addCallback(
//                success -> log.info("message sent with success {} at partition {} for offset {}",
//                        message, success.getRecordMetadata().partition(), success.getRecordMetadata().offset()),
//                failure -> log.error("error sending message"));
    }
}
