package com.jwt.security.controller;

import com.jwt.security.model.UserRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
        public String login(@RequestBody UserRequest userRequest) {
            System.out.println("Got the user details to login!!");
            return "Successfully generated the JWT Token!!";
        }
}
