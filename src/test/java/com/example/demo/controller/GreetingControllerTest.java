package com.example.demo.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest

class GreetingControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("GET /hello -> HTTP 200")
    void RESTAPI() throws Exception {
        //Given /hello
        String endpointURL ="/hello";
        //When
        mockMvc.perform(MockMvcRequestBuilders.get(endpointURL))
        //Then
                .andExpect(MockMvcResultMatchers.status().is(200));
    }
}