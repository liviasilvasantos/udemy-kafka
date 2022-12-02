package com.liviasilvasantos.strconsumer.listeners;

import com.liviasilvasantos.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StrConsumerListener {

    //    @KafkaListener(groupId = "group-01", topicPartitions = {
//            @TopicPartition(topic = "str-topic", partitions = {"0"})
//    }, containerFactory = "strContainerFactory")
    @StrConsumerCustomListener(groupId = "group-01")
    public void listener(final String message) {
        log.info("message received {}", message);
    }

    //    @KafkaListener(groupId = "group-01", topicPartitions = {
//            @TopicPartition(topic = "str-topic", partitions = {"1"})
//    }, containerFactory = "strContainerFactory")
    @StrConsumerCustomListener(groupId = "group-01")
    public void log(final String message) {
        log.info("LOG :: message received {}", message);
    }

    //    @KafkaListener(groupId = "group-02", topics = "str-topic",
//    containerFactory ="strContainerFactory")
    @StrConsumerCustomListener(groupId = "group-02")
    public void extra(final String message) {
        log.info("EXTRA :: message received {}", message);
    }
}


