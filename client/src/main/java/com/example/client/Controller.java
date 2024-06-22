package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RefreshScope
public class Controller {

    @Value("${test.a:empty}")
    private String a;
    @Value("${test.b:empty}")
    private String b;

    @GetMapping("/a")
    public String getA() {
        return a;
    }
    @GetMapping("/b")
    public String getB() {
        return b;
    }
}
