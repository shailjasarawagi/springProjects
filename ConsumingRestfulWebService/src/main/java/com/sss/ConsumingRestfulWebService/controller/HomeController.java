package com.sss.ConsumingRestfulWebService.controller;

import com.sss.ConsumingRestfulWebService.domain.Greeting;
import com.sss.ConsumingRestfulWebService.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/fetch_greeting_data")
public class HomeController {

    public final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService){
        this.homeService = homeService;
    }
    @GetMapping
    public Greeting fetchGreetingData(){
        return homeService.fetchGreetingInfo();
    }
}
