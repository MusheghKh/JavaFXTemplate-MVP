package com.rise.fxapp.service;

import com.rise.fxapp.model.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonService {

    public PersonService() {
        log.info("Initializing Person Service");
    }

    public Person getPerson(){
        return new Person("Thiago", 26);
    }
}
