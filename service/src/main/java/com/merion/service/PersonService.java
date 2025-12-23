package com.merion.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.merion.core.Person;

import java.io.IOException;

public class PersonService {
    public Person parse(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);
        return person;
    }

    public String convert(Person person) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(person);
    }
}