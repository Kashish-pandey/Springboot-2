package com.kashish.demo.DependancyInjection;

import org.springframework.stereotype.Component;
@Component

public class PaymentService {
    public void pay(){
        System.out.println("Payment done");
    }
}
