package com.challenge.connected.cities.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/connected")
    public boolean getCityNames(@RequestParam String origin, @RequestParam String destination){
        return false;
    }
}
