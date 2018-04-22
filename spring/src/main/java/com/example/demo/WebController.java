package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    UserRepository repository;

    @GetMapping("getAll")
    public String getAll() {
        StringBuilder sb = new StringBuilder();
        Iterable<ExampleTable> all = repository.findAll();
        all.forEach(s -> sb.append(s.getLastName()));
        return sb.toString();
    }


}
