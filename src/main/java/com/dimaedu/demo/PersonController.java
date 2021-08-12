package com.dimaedu.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    /*
    http://localhost:8080/person
     */


    Repository rep = new Repository();


   // @RequestMapping("/person")
    @GetMapping("/person")
    public Person person(@RequestParam(value = "name", defaultValue = "") String name) {
        return rep.personByName(name);
    }

    @PostMapping("/person")
    public Person personUpdate(
            @RequestParam(value = "name", required = true ) String name,
            @RequestParam(value = "age", required = true) int age) {

        Person p = rep.personByName(name);
        if (p != null) {
            p.setAge(age);
            return p;
        }
        else
            return rep.addPerson(new Person(name, age));


    }




}