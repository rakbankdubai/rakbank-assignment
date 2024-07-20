package com.rakbank.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.rakbank.demo.controller;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // This method is intentionally left empty because it is used to check if the application context loads successfully.

        Rakbankcontroller test = new Rakbankcontroller();
        test.getrakbank();
    }
}
