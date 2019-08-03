package com.example.demo.login.domain.model;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.security.SecureRandom;

@Data
public class SignupForm {

    private String userId;
    private String password;
    private String userName;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Data birthday;

    private int age;
    private boolean marriage;
}

