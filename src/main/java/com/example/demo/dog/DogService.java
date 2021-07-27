package com.example.demo.dog;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    public List<Dog> getDogs() {
        return List.of(
                new Dog(
                        "Spike",
                        "Large",
                        "Brown"
                )
        );
    }
}
