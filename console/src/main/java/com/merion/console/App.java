package com.merion.console;

import com.merion.service.PersonService;
import com.merion.core.Person;

import java.io.IOException;


public class App {
    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setFirstName("Jon");
        person.setLastName("Smith");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person fromJson = personService.parse(json);
        System.out.println(fromJson);
    }
}