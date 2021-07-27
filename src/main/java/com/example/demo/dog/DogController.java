package com.example.demo.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/dog")
public class DogController {
    private DogService dogservice;

    @Autowired
    public DogController(DogService dogService) {
        this.dogservice = dogService;
    }

    @GetMapping
    @DeleteMapping
    public List<Dog> getDogs() {
        return this.dogservice.getDogs();
    }
}
