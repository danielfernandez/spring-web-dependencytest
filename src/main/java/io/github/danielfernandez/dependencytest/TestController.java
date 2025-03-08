package io.github.danielfernandez.dependencytest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/")
    public String test() {
        return "The app seems to work fine";
    }

}
