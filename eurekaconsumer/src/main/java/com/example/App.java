package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * \* User: guojie
 * \* Date: 2018/7/30
 * \* Time: 16:58
 * \* Description:
 * \
 */

@EnableDiscoveryClient
@SpringBootApplication
public class App {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
