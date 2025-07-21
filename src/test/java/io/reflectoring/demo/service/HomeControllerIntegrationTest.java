package io.reflectoring.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@MySqlContainerConfig
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class HomeControllerIntegrationTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;
    @Autowired

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        System.out.println("webApplicationContext: " + webApplicationContext);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void testHomeEndpointWithDefaultParam() throws Exception {
        System.out.println("mockMvc: " + mockMvc);
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Saved user: Test User 0"));
    }

    @Test
    void testHomeEndpointWithCustomParam() throws Exception {
        mockMvc.perform(get("/").param("a", "1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Saved user: Test User 1"));
        mockMvc.perform(get("/").param("a", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("Saved user: Test User 5"));
    }
}
