package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author athakor
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String testProfile(@Value("${app.name}") String appName) {
        return appName;
    }
}
