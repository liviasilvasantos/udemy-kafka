package com.liviasilvasantos.paymentservice.service;

import com.liviasilvasantos.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
