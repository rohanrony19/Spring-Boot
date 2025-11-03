package com.springQualifier;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component("upi")
public class PaymentType {

    private String paymentType;

    public PaymentType(){
        System.out.println("Payment is created...");
    }
}
