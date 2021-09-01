package com.github.mathann26.example.springwar.springwar;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    // must provide the context path in the jboss-web.xml.
    @GetMapping("/greet")
    public String greet(){
        return "Hello world from wildfly!";
    }
}
