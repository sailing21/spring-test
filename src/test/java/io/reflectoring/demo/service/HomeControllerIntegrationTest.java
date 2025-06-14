package io.reflectoring.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class HomeControllerIntegrationTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void testHomeEndpointWithDefaultParam() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("others"));
    }

    @Test
    void testHomeEndpointWithCustomParam() throws Exception {
        mockMvc.perform(get("/").param("a", "11"))
               .andExpect(status().isOk())
               .andExpect(content().string("ten"));
    }
    @Test
    void testHomeEndpointWithCustomParam200() throws Exception {
        mockMvc.perform(get("/").param("a", "21"))
               .andExpect(status().isOk())
               .andExpect(content().string("twenty"));
    }
}
