package com.javaqueries.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="Hello World") String name) {
        return name;
    }

}
