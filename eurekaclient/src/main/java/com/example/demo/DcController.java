package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* User: guojie
 * \* Date: 2018/7/30
 * \* Time: 11:14
 * \* Description:
 * \
 */

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;
    @RequestMapping("/dc")
    public String dc(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
