package com.example.demo;

import org.junit.Assert;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @org.junit.Test
    public void added() {
        DemoApplication demoApplication = new DemoApplication();
        assertEquals(10,demoApplication.added(5,5));
    }

}
