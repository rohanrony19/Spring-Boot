package com.springXmlConfigurationDI.constructor.injection;

import lombok.ToString;

@ToString
public class Patient {
    private int patientId;
    private String patientName;
    private long mobileNumber;

    public Patient(){
        System.out.println("Default Patient Constructor is created ");
    }

    public Patient(int patientId, String patientName) {
        System.out.println("2 Parameterized Constructor of Patient is called");
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public Patient(int patientId, String patientName, long mobileNumber) {
        System.out.println("3 Parameterized Constructor of Patient is called");
        this.patientId = patientId;
        this.patientName = patientName;
        this.mobileNumber = mobileNumber;
    }
}
