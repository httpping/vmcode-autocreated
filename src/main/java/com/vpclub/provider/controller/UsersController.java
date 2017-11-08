package com.vpclub.provider.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vpclub.provider.entity.Users;
import com.vpclub.provider.service.IUsersService;


import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tp
 * @since 2017-11-08
 */
@RestController
@AllArgsConstructor
@RequestMapping("/provider/users")
public class UsersController {

    IUsersService mUsersService;

    @RequestMapping("/query")
    public Users query(@RequestBody Users param){
        return null;
    }
}
