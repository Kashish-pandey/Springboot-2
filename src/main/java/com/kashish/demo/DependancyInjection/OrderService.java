package com.kashish.demo.DependancyInjection;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void order() {
        paymentService.pay();
        System.out.println("Order placed");
    }
}