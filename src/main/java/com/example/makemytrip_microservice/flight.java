package com.example.makemytrip_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping ("/flight")
public String getdate() {return "Please book your flight ticket in bengluru 49% discount" ; }
}
