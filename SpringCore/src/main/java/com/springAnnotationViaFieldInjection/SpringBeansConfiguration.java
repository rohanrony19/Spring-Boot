package com.springAnnotationViaFieldInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springAnnotationViaFieldInjection")
public class SpringBeansConfiguration {

    @Bean
    public Address address(){
        Address a = new Address();
        a.setPincode(577000);
        a.setCity("Bangalore");
        return a;
    }
}
