package com.springQualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.springQualifier")
public class PaymentConfig {

    @Primary
    @Bean
    public PaymentType creditCard(){
        PaymentType payment = new PaymentType();
        payment.setPaymentType("credit card");
        return payment;
    }




    

    // default bean injection without using @Qualifier

    @Bean
    public PaymentType debitCard(){
        PaymentType payment = new PaymentType();
        payment.setPaymentType("debit card");
        return payment;
    }

}
