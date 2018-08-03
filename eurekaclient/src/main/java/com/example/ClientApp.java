package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * \* User: guojie
 * \* Date: 2018/7/30
 * \* Time: 11:13
 * \* Description:
 * \
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApp {

    public static void main(String[] args){
        SpringApplication.run(ClientApp.class, args);
    }
}
