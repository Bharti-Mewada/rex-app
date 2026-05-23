package com.converter.rex_app.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumerService {

    @RabbitListener(queues = "address-queue")
    public void consume(String message){

        System.out.println("====================================");
        System.out.println("Received From RabbitMQ Queue");
        System.out.println(message);

        // Simulate DB Save
        System.out.println("Saving Into Database...");

        System.out.println("====================================");
    }
}
