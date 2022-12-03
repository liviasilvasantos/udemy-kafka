package com.liviasilvasantos.paymentservice.service.impl;

import com.liviasilvasantos.paymentservice.model.Payment;
import com.liviasilvasantos.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
        log.info("received payment {}", payment);
        Thread.sleep(1000);

        log.info("sending payment...");
        kafkaTemplate.send("payment-topic", payment);
    }
}
