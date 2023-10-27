package com.example.schoolmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("student")
public class
StudentController {

    @GetMapping("/list")
    public List<String> getStudentNames() {

        return Arrays.asList("Karna", "Mani", "Iniyan", "Arun", "Amir");
    }
}
