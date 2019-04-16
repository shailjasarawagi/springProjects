package com.sss.ConsumingRestfulWebService.service;

import com.sss.ConsumingRestfulWebService.domain.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeServiceImpl implements HomeService {

 private final RestTemplate restTemplate;
 @Autowired
 public HomeServiceImpl(RestTemplate restTemplate){
     this.restTemplate=restTemplate;
 }
    @Override
    public Greeting fetchGreetingInfo() {
        return restTemplate.getForObject("http://localhost:8080/greeting?name=shailja" ,Greeting.class);
    }
}
