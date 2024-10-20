package com.example.testforjenkings;

import com.example.testforjenkings.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestforjenkingsApplicationTests {

    @Autowired
    HomeController homeController;

    @Test
    void contextLoads() {

        assert(homeController).homePage().equals("index");
    }


}
