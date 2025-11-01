package com.springXmlConfigurationDI.SpringBeanAutoWiring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hospital {
    private String name;
    private Patient patient;

    private Hospital(Patient p1){
        System.out.println("Patient injected via constructor : p1");
        this.patient = p1;
    }
}
