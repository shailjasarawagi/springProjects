package com.sss.ConsumingRestfulWebService.service;

import com.sss.ConsumingRestfulWebService.domain.Greeting;
import org.springframework.stereotype.Service;

@Service
public interface HomeService {

    Greeting fetchGreetingInfo();
}
