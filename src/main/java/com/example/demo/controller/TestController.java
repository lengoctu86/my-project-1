package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    private static final Logger log = LogManager.getLogger(TestController.class);

    @GetMapping
    public String getText () {
        log.info("Start API!");
        String output = "some output 1";
        log.info("End API! Return " + output);
        return output;
    }

}
