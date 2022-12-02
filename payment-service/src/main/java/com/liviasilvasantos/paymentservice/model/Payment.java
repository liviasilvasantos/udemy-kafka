package com.liviasilvasantos.paymentservice.model;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class Payment implements Serializable {

    private final Long id;
    private final Long idUser;
    private final Long idProduct;
    private final String cardNumber;
}
