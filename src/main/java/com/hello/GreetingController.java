package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    IGreetService service;

    @GetMapping("/abc")
    public String root(@RequestParam(name = "name", required = false, defaultValue = "world") String name) {
        return service.getPeople(name);
    }

}