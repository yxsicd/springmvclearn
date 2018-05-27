package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return "greeting123";
    }

    @GetMapping("/")
    public String root(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return "/" + name;
    }

}