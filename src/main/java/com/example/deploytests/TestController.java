package com.example.deploytests;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIElD9UZJvR/+rm4ve732Cq+/DzvC9rWJjawQtsEh4KIS zakella@zapolski

@RestController
@RequestMapping
public class TestController {

    @GetMapping
    public String sayHello(){
        return "Hello!!!";
    }
}
