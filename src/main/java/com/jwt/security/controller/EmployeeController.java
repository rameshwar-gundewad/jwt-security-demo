package com.jwt.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/employee")
public class EmployeeController {

    @GetMapping
    public String getAllEmployee(){
        System.out.println("Getting all employee list!!");
        return "Successfully got all employee list!!";
    }
}
