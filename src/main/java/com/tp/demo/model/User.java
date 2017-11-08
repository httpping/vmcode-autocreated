package com.tp.demo.model;

import lombok.Data;

/**
 * @author tanping
 * @create 2017-11-03 17:12
 **/
@Data
public class User {
    String name ;
    int age ;
    String pw ;
    public static String defaultPw = "abc";

    String message;
}
