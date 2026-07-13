package com.kashish.demo.DependancyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired //Filled injection;
    PaymentService paymentService;

    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @Autowired
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void order(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
