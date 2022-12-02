package com.liviasilvasantos.strconsumer.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ErrorCustomHandler implements KafkaListenerErrorHandler  {


    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException e) {
        log.info("exception handler ::: captured error");
        log.info("payload ::: {}", message.getPayload());
        log.info("headers ::: {}", message.getHeaders());
        log.info("message exception ::: {}", e.getMessage());
        return null;
    }

//    @Override
//    public Object handleError(Message<?> message, ListenerExecutionFailedException exception, Consumer<?, ?> consumer) {
//        return KafkaListenerErrorHandler.super.handleError(message, exception, consumer);
//    }
}
