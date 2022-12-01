package com.liviasilvasantos.strconsumer.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StrConsumerListener {

    @KafkaListener(groupId = "group-01", topics = "str-topic", containerFactory = "strContainerFactory")
    public void listener(final String message) {
        log.info("message received {}", message);
    }

    @KafkaListener(groupId = "group-01", topics = "str-topic", containerFactory = "strContainerFactory")
    public void log(final String message) {
        log.info("LOG :: message received {}", message);
    }

    @KafkaListener(groupId = "group-02", topics = "str-topic", containerFactory = "strContainerFactory")
    public void extra(final String message) {
        log.info("EXTRA :: message received {}", message);
    }
}


