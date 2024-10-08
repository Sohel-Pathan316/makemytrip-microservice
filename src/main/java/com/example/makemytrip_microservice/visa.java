package com.example.makemytrip_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping ("/visa")
    public String getdate() {return "Please book your visa in pune & mumbai 10% discount" ; }
}