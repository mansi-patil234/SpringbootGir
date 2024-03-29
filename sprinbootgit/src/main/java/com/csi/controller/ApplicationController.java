package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String hello() {
        return "done succesfuly";
    }

    @GetMapping("/service")
    public String welcome() {
        return "services added by jaya";
    }

    @GetMapping("/address")
    public String by() {
        return "address added/pune";
    }

    @GetMapping("/name")
    public String name() {
        return "username";
    }
    @GetMapping("/mansi")
    public String mansi() {
        return "MERAname";
    }
}
