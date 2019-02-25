package com.prodtrak.prodtrakservice.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String sayPlainHello(){
        return "hello world";
    }


}
