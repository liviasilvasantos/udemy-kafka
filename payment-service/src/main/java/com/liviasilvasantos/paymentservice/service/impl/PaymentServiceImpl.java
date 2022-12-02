package com.liviasilvasantos.paymentservice.service.impl;

import com.liviasilvasantos.paymentservice.model.Payment;
import com.liviasilvasantos.paymentservice.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("sending payment {}", payment);
    }
}
