package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tanping
 * @create 2017-11-08 16:05
 **/
@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(
                App.class);
        application.run(args);

//        com.vpclub.provider.service.rpc.UsersProto s ;
    }

}
