package com.springQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentInitializer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfig.class);
        PaymentGateway payment = context.getBean(PaymentGateway.class);

        PaymentType paymentType = payment.getPaymentType();
        System.out.println(paymentType);
        System.out.println(paymentType.getPaymentType());

        System.out.println("beans of paymentType : ");
        System.out.println(context.getBean("creditCard"));
        System.out.println(context.getBean("debitCard"));
        System.out.println(context.getBean("upi"));
    }
}
