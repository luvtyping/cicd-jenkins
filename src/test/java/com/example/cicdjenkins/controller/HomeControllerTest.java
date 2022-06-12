package com.example.cicdjenkins.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
class HomeControllerTest {

    @Autowired
    private HomeController homeController;

    @ParameterizedTest
    @ValueSource(strings = {"John", "Bob", "Alex","Kek"})
    void getHello(String name) {
        Assertions.assertEquals("Hello, " + name + "!!", homeController.getHello(name).getBody());
    }

    @Test
    void testOkStatus() {
        Assertions.assertEquals(HttpStatus.OK, homeController.getHello("Name").getStatusCode());
    }
}
