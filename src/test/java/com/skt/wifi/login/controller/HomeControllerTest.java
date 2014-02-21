package com.skt.wifi.login.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.server.setup.MockMvcBuilders.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import com.skt.wifi.mgr.login.controller.HomeController;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration
public class HomeControllerTest {
//	@Autowired
//    private WebApplicationContext wac;
// 
//    private MockMvc mockMvc;
// 
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.webApplicationContextSetup(this.wac).build();
//    }
// 
//    @Test
//    public void tilesDefinitions() throws Exception {
//        this.mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(forwardedUrl("/WEB-INF/views/home.jsp"));
//    }
}
