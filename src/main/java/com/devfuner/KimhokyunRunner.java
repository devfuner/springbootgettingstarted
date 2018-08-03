package com.devfuner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class KimhokyunRunner implements ApplicationRunner {

    @Autowired
    Kimhokyun kimhokyun;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(kimhokyun);
    }
}
