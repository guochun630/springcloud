package com.example.demo;

import com.example.demo.didispace.domain.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(MockServletContext.class)
@WebAppConfiguration
public class ApplicationTests {

    private MockMvc mvc;

//    @Autowired
//    private BlogProperties blogProperties;

    @Test
    public void getHello(){
//        Assert.assertEquals(blogProperties.getName(), "郭洁");
//        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
    }
}
