package com.example.zuulservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@Slf4j
public class ZuulServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulServiceApplication.class, args);
        log.info("ZuulServiceApplication start");
    }

}
