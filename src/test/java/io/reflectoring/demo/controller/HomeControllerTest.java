package io.reflectoring.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {
    @Test
    void home() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals("Hello World!", result);
    }

}