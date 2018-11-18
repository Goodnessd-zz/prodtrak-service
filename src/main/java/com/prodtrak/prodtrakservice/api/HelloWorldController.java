package com.prodtrak.prodtrakservice.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String sayPlainHello(){
        return "hello world";
    }

}
