package com.techwithden.Swagger3.controller;

import com.techwithden.Swagger3.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class PersonController {


    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPersons(){
        List persons = new ArrayList<>();
        persons.add(new Person(1,"Mike", 10));
        persons.add(new Person(2,"James", 15));
        persons.add(new Person(3,"Mary", 23));
        persons.add(new Person(4,"Souvik", 34));
        return ResponseEntity.ok(persons);
    }
    @GetMapping("/single")
    public ResponseEntity<Person> getSinglePersons(@RequestParam int id){
        return ResponseEntity.ok(new Person(id,"Diya", 10));
    }
    @PostMapping("/save")
    public ResponseEntity<String> savePerson(@Validated @RequestBody Person person){
        return ResponseEntity.ok("Successfully Received Person");
    }

}
