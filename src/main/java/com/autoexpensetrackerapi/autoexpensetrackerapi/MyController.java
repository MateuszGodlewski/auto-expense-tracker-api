package com.autoexpensetrackerapi.autoexpensetrackerapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MyEntityRepository myEntityRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/save")
    public String saveData(@RequestBody MyEntity myEntity) {
        myEntityRepository.save(myEntity);
        return "Data saved successfully!";
    }
}