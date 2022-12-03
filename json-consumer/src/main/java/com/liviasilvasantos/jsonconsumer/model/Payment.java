package com.liviasilvasantos.jsonconsumer.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Builder
@ToString
public class Payment implements Serializable {

    private final Long id;
    private final Long idUser;
    private final Long idProduct;
    private final String cardNumber;
}
