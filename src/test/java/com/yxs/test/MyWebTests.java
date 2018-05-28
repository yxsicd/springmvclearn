package com.yxs.test;

import com.hello.GreetingController;
import com.hello.IGreetService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class MyWebTests {

    private MockMvc mockMvc;

    @Mock
    private IGreetService service;

    @InjectMocks
    GreetingController greetController;


    @Before
    public void setup() {

        MockitoAnnotations.initMocks(this);
        Mockito.when(service.getPeople("123")).thenReturn("123");
        this.mockMvc = MockMvcBuilders.standaloneSetup(greetController).build();
    }


    @Test
    public void TestG() throws Exception {
        this.mockMvc.perform(get("/abc?name=123")).andExpect(content().string("123"));
    }

}