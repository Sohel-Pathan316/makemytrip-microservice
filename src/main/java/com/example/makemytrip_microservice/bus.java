package com.example.makemytrip_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping ("/bus")
    public String getdate() {return "Please book your bus in pune 30% discount" ; }
}
