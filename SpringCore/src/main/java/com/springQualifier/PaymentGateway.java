package com.springQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    private int amount;
    private String email;

//    @Qualifier("abc") // bean id named inside @Component of PaymentType
//    @Autowired //problem came
//    private PaymentType paymentType; //upi,cc,db

    @Qualifier("debitCard")  // act as ref
    @Autowired
    private PaymentType paymentType1;

    public PaymentGateway(){
        System.out.println("PaymentGateway is created...");
    }

    public int getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public PaymentType getPaymentType() {
        return paymentType1;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
