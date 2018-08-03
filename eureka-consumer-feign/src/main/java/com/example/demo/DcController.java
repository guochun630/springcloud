package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* User: guojie
 * \* Date: 2018/7/30
 * \* Time: 17:01
 * \* Description:
 * \
 */

@RestController
public class DcController {


    @Autowired
    private DcClient dcClient;

    @RequestMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }
}
