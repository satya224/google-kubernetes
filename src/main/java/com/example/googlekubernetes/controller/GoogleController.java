package com.example.googlekubernetes.controller;

import com.example.googlekubernetes.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GoogleController {
    @GetMapping("get-message")
    public Response<String> getMessage() {
        return new Response<>(
                "App is working!",
                "success",
                HttpStatus.OK
        );
    }

    @GetMapping("hello")
    public Response<String> getHello() {
        return new Response<>(
                "Hello World Again!",
                "success",
                HttpStatus.OK
        );
    }
}
