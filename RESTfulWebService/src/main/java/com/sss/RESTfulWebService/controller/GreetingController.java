package com.sss.RESTfulWebService.controller;

import com.sss.RESTfulWebService.resource.Greeting;
import com.sss.RESTfulWebService.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingInterface greetingInterface;

    @Autowired
    public GreetingController(GreetingInterface greetingInterface){
        this.greetingInterface=greetingInterface;
    }

    @GetMapping(value ="/greeting")
    public Greeting getGreetingDetail(@RequestParam(value = "name",defaultValue = "world") String name){
        return greetingInterface.getMyObject(name);
//        Greeting greeting = new Greeting();
//        greeting.setId(1);
//        greeting.setContent("Hello world");
//        return greeting;

    }

}
