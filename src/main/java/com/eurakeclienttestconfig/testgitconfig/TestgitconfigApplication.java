package com.eurakeclienttestconfig.testgitconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//自动感知变量更新,需要手动post    localhost:8882/refresh
@RefreshScope
public class TestgitconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestgitconfigApplication.class, args);
    }





    @Value("${hello}")
    String hello;
    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }





}
