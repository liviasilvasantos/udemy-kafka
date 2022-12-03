package com.liviasilvasantos.jsonconsumer.listener;

import com.liviasilvasantos.jsonconsumer.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
@Slf4j
public class JsonListener {

    @SneakyThrows
    @KafkaListener(topics="payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraude(@Payload final Payment payment){
        log.info("recebi o pagamento ::: {}", payment);
        sleep(2000);

        log.info("validando fraude ::: ");
        sleep(2000);

        log.info("compra aprovada");
        sleep(2000);
    }

    @SneakyThrows
    @KafkaListener(topics="payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload final Payment payment){
        log.info("gerando pdf do produto de id ::: {}", payment.getIdProduct());
        sleep(3000);
    }

    @SneakyThrows
    @KafkaListener(topics="payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail(@Payload final Payment payment){
        log.info("enviando email de confirmacao ::: ");
        sleep(2000);
    }
}
