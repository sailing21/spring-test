package io.reflectoring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class InnerService {
    public String getMessage(int a) {
        if(a > 20){
            return "twenty";
        }
        if(a > 10){
            return "ten";
        }

        return "others";
    }
}
