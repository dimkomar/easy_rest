package com.dimaedu.demo;


import java.util.Hashtable;
import java.util.Map;



public class Repository {

    static Map<String, Person> persons = new Hashtable<>();

    static {
        persons.put("Sergey", new Person("Sergey", 35));
        persons.put("Kolia", new Person("Kolia", 11));
        persons.put("Valik", new Person("Valik", 22));

    }

    //return object person by key
    public Person personByName(String name) {
        return persons.get(name);
    }
    //add
    public Person addPerson(Person p) {
        persons.put(p.getName(),p);
        return p;
    }




}