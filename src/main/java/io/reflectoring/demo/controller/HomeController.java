package io.reflectoring.demo.controller;

import io.reflectoring.demo.service.InnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private InnerService innerService;
    @GetMapping("/")
    public String home(
            @RequestParam  (required = false, defaultValue = "0") int a
    ) {
        return innerService.getMessage(a);
    }
}
