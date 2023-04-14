package com.springtest.testspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringbootApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "HJ";
    }
    @GetMapping("/great")
    public String great(@RequestParam(name = "name",required = false) String name)
    {
        if (name != null)
        {
            return "Hello " + name;
        }
        else
        {
            return "HJ";
        }
    }
}
