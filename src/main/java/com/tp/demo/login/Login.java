package com.tp.demo.login;

import com.tp.demo.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆
 *
 * @author tanping
 * @create 2017-11-03 17:11
 **/
@RestController
@RequestMapping("/api")
public class Login {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(@RequestBody User user){

        if (user.getName() == null ){
            user.setMessage("name  is null");
            return  user;
        }

        if (User.defaultPw.equals(user.getPw())){
            user.setMessage("login success! ");
            return  user;
        }

        user.setMessage("fail");

        return  user;
    }
}
