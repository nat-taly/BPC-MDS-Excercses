package com.example.bpcmdsex03.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Test {
    @GetMapping("test")
    public List<String> test(){
        return List.of("Hello", "World");
    }
}
