package com.ddd.video.example.apps.mooc.controllers;

import ch.qos.logback.core.util.ContentTypeUtil;
import jdk.jfr.ContentType;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * This allow us to avoid the http layer for own tests, but not avoid the same behaviour.
 *
 * This is the infra structure layer.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public abstract class RequestTestCase {

    @Autowired
    private MockMvc mockMvc;

    public void assertResponse(String endpoint,
                               Integer expectedStatusCode,
                               String expectedResponse) throws Exception {

        ResultMatcher response = expectedResponse.isEmpty()
                ? content().string("")
                : content().json(expectedResponse);
    }

    public void getRequest(String endpoint, Integer expectedStatusCode, String expectedResponse) throws Exception {
        mockMvc
                .perform(get(endpoint))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(content().json(expectedResponse));
    }

    public void postRequest(String endpoint, Integer expectedStatusCode) throws Exception {
        mockMvc
                .perform(post(endpoint))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(content().string(""));
    }

    public void putRequest(String endpoint, Integer expectedStatusCode) throws Exception {
        mockMvc
                .perform(put(endpoint))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(content().string(""));
    }

    public void putRequest(String endpoint, String body, Integer expectedStatusCode) throws Exception {
        mockMvc
                .perform(put(endpoint).content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(content().string(""));
    }

}
