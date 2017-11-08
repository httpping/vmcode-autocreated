package com.tp.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
//@Controller
//@EnableAutoConfiguration
@SpringBootApplication

public class SampleController {

//    @RequestMapping(value = "/index",method = {RequestMethod.POST,RequestMethod.GET} )
//    @ResponseBody
//    String home(String username) {
//        log.info("come 【表情】 {}", username);
//        return "Hello World!";
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}