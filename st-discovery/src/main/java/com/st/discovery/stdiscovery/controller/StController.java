package com.st.discovery.stdiscovery.controller;

import com.st.discovery.stdiscovery.pojo.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StController {

    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person searchPerson(@PathVariable Integer id){
        Person person = new Person();
        person.setId(id);
        person.setName("StSpirit" + id);
        System.out.println("ststsst|" + id);
        return person;
    }

}
