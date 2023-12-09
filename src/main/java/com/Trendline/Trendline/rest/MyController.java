package com.Trendline.Trendline.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    String home() {
        return "Welcome to the phone application!";
    }

}
